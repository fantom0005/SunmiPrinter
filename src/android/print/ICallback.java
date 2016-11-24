/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/fantom/Desktop/PrinterTestDemo/PrinterTestDemo/src/woyou/aidlservice/jiuiv5/ICallback.aidl
 */
package sunmi.printer;
/**
 * printing server result callback
 */
public interface ICallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements sunmi.printer.ICallback
{
private static final java.lang.String DESCRIPTOR = "sunmi.printer.ICallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an sunmi.printer.ICallback interface,
 * generating a proxy if needed.
 */
public static sunmi.printer.ICallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof sunmi.printer.ICallback))) {
return ((sunmi.printer.ICallback)iin);
}
return new sunmi.printer.ICallback.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_onRunResult:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onRunResult(_arg0);
return true;
}
case TRANSACTION_onReturnString:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.onReturnString(_arg0);
return true;
}
case TRANSACTION_onRaiseException:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.onRaiseException(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements sunmi.printer.ICallback
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/**
	* return result
	* @param isSuccess:	  true--Execute successfully ，false--Execute failure
	*/
@Override public void onRunResult(boolean isSuccess) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isSuccess)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onRunResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
	* return result(characters)
	* @param result   the length which has been printed since power on (unit: mm)
	*/
@Override public void onReturnString(java.lang.String result) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(result);
mRemote.transact(Stub.TRANSACTION_onReturnString, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
	* excute exception
	* code：  exception
	* msg:	exception description
	*/
@Override public void onRaiseException(int code, java.lang.String msg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(code);
_data.writeString(msg);
mRemote.transact(Stub.TRANSACTION_onRaiseException, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onRunResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onReturnString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onRaiseException = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
/**
	* return result
	* @param isSuccess:	  true--Execute successfully ，false--Execute failure
	*/
public void onRunResult(boolean isSuccess) throws android.os.RemoteException;
/**
	* return result(characters)
	* @param result   the length which has been printed since power on (unit: mm)
	*/
public void onReturnString(java.lang.String result) throws android.os.RemoteException;
/**
	* excute exception
	* code：  exception
	* msg:	exception description
	*/
public void onRaiseException(int code, java.lang.String msg) throws android.os.RemoteException;
}
