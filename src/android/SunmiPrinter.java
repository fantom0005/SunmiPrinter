package sunmi.printer;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaInterface;
import java.lang.Exception;
import woyou.aidlservice.jiuiv5.ICallback;
import woyou.aidlservice.jiuiv5.IWoyouService;
import android.app.Activity;
import android.content.ServiceConnection;
import android.content.ComponentName;
import android.os.IBinder;
import android.os.RemoteException;
import android.content.Intent;
import android.content.Context;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class SunmiPrinter extends CordovaPlugin {
    private IWoyouService woyouService;
    private ICallback callback = null;

    private ServiceConnection connService = new ServiceConnection() {

		@Override
		public void onServiceDisconnected(ComponentName name) {
			woyouService = null;
		}

		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			woyouService = IWoyouService.Stub.asInterface(service);
		}
	};

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);	
        callback = new ICallback.Stub() {
			
			@Override
			public void onRunResult(final boolean success) throws RemoteException {
			}
			
			@Override
			public void onReturnString(final String value) throws RemoteException {			
			}
			
			@Override
			public void onRaiseException(int code, final String msg) throws RemoteException {		
			}
		};	

        Activity context = cordova.getActivity(); 

        Intent intent=new Intent();
		intent.setPackage("woyou.aidlservice.jiuiv5");
		intent.setAction("woyou.aidlservice.jiuiv5.IWoyouService");
		context.startService(intent);
		context.bindService(intent, connService, Context.BIND_AUTO_CREATE);
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("coolMethod")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        }
        return false;
    }

    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            ThreadPoolManager.getInstance().executeTask(new Runnable(){
                @Override
                public void run() {
                try {
                    woyouService.printText("Пошел на хуй \n asdas", null);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }});
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}
