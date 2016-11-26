/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/fantom/Desktop/PrinterTest/app/src/main/aidl/woyou/aidlservice/jiuiv5/IWoyouService.aidl
 */
package woyou.aidlservice.jiuiv5;
public interface IWoyouService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements woyou.aidlservice.jiuiv5.IWoyouService
{
private static final java.lang.String DESCRIPTOR = "woyou.aidlservice.jiuiv5.IWoyouService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an woyou.aidlservice.jiuiv5.IWoyouService interface,
 * generating a proxy if needed.
 */
public static woyou.aidlservice.jiuiv5.IWoyouService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof woyou.aidlservice.jiuiv5.IWoyouService))) {
return ((woyou.aidlservice.jiuiv5.IWoyouService)iin);
}
return new woyou.aidlservice.jiuiv5.IWoyouService.Stub.Proxy(obj);
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
case TRANSACTION_updateFirmware:
{
data.enforceInterface(DESCRIPTOR);
this.updateFirmware();
reply.writeNoException();
return true;
}
case TRANSACTION_getFirmwareStatus:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getFirmwareStatus();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getServiceVersion:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getServiceVersion();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_printerInit:
{
data.enforceInterface(DESCRIPTOR);
woyou.aidlservice.jiuiv5.ICallback _arg0;
_arg0 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.printerInit(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_printerSelfChecking:
{
data.enforceInterface(DESCRIPTOR);
woyou.aidlservice.jiuiv5.ICallback _arg0;
_arg0 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.printerSelfChecking(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getPrinterSerialNo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getPrinterSerialNo();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getPrinterVersion:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getPrinterVersion();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getPrinterModal:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getPrinterModal();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getPrintedLength:
{
data.enforceInterface(DESCRIPTOR);
woyou.aidlservice.jiuiv5.ICallback _arg0;
_arg0 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.getPrintedLength(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_lineWrap:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
woyou.aidlservice.jiuiv5.ICallback _arg1;
_arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.lineWrap(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_sendRAWData:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
woyou.aidlservice.jiuiv5.ICallback _arg1;
_arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.sendRAWData(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setAlignment:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
woyou.aidlservice.jiuiv5.ICallback _arg1;
_arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.setAlignment(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setFontName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
woyou.aidlservice.jiuiv5.ICallback _arg1;
_arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.setFontName(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setFontSize:
{
data.enforceInterface(DESCRIPTOR);
float _arg0;
_arg0 = data.readFloat();
woyou.aidlservice.jiuiv5.ICallback _arg1;
_arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.setFontSize(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_printText:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
woyou.aidlservice.jiuiv5.ICallback _arg1;
_arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.printText(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_printTextWithFont:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
float _arg2;
_arg2 = data.readFloat();
woyou.aidlservice.jiuiv5.ICallback _arg3;
_arg3 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.printTextWithFont(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_printColumnsText:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _arg0;
_arg0 = data.createStringArray();
int[] _arg1;
_arg1 = data.createIntArray();
int[] _arg2;
_arg2 = data.createIntArray();
woyou.aidlservice.jiuiv5.ICallback _arg3;
_arg3 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.printColumnsText(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_printBitmap:
{
data.enforceInterface(DESCRIPTOR);
android.graphics.Bitmap _arg0;
if ((0!=data.readInt())) {
_arg0 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
woyou.aidlservice.jiuiv5.ICallback _arg1;
_arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.printBitmap(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_printBarCode:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
woyou.aidlservice.jiuiv5.ICallback _arg5;
_arg5 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.printBarCode(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_printQRCode:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
woyou.aidlservice.jiuiv5.ICallback _arg3;
_arg3 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.printQRCode(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_printOriginalText:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
woyou.aidlservice.jiuiv5.ICallback _arg1;
_arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.printOriginalText(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_commitPrinterBuffer:
{
data.enforceInterface(DESCRIPTOR);
this.commitPrinterBuffer();
reply.writeNoException();
return true;
}
case TRANSACTION_enterPrinterBuffer:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.enterPrinterBuffer(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_exitPrinterBuffer:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.exitPrinterBuffer(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements woyou.aidlservice.jiuiv5.IWoyouService
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
	* 
	* Printer firmware update(called by system,developer can't call it)
	* @param buffer			
	* @param size
	* @param filename
	* @param iapInterface
	*/
@Override public void updateFirmware() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_updateFirmware, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getFirmwareStatus() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getFirmwareStatus, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
	* 
	* Getting WoyouService version
	*/
@Override public java.lang.String getServiceVersion() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getServiceVersion, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
	 * 
	 * 
	 * Init printer,reset printer's logical program,but don't fresh the cash,the printing work will go on after reset
	 * @param callback 
	 * @return
	 */
@Override public void printerInit(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_printerInit, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 
	* Printer self-inspection, the printer will print a page
	* @param callback 
	*/
@Override public void printerSelfChecking(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_printerSelfChecking, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 
	* Getting the printer board serial number
	*/
@Override public java.lang.String getPrinterSerialNo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPrinterSerialNo, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
	* 
	* Getting the printer firmware version
	*/
@Override public java.lang.String getPrinterVersion() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPrinterVersion, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
	* 
	* Getting the printer model
	*/
@Override public java.lang.String getPrinterModal() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPrinterModal, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
	* 
	* Getting the print head's  printing length 
	*/
@Override public void getPrintedLength(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getPrintedLength, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	 * 
	 * running a paper(force a newline,running n line before stop)
	 * @param n:	line number
	 * @param callback  
	 * @return
	 */
@Override public void lineWrap(int n, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(n);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_lineWrap, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 
	* Using original caommand
	* @param data	        command
	* @param callback  
	*/
@Override public void sendRAWData(byte[] data, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(data);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_sendRAWData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 
	* Set the alignment mode, affect the later priting ,unless you are initialized
	* @param alignment:	alignment 0--align left , 1--align center, 2--align right
	* @param callback  
	*/
@Override public void setAlignment(int alignment, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(alignment);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setAlignment, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 
	* set print font ,take affect on the later printing,unless you initialize the printer(support only one font 'gh' ,gh is a Chinese font,more fonts will be supported later)
	* @param typeface:		font name
	*/
@Override public void setFontName(java.lang.String typeface, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(typeface);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setFontName, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* setting font size ,afect the later printig ,unless you are initialized.
	* Note: setting font size is a method over international standard cammand
	* Adjust the font size will affect the character width,the number of characters per line will also change
	* @param fontsize:	
	*/
@Override public void setFontSize(float fontsize, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloat(fontsize);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setFontSize, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* print line ,automatic reline at the end of line. The line of characters will not be printed unless you forcing a newline
	* @param characters:	 characters of word what you want print
	*/
@Override public void printText(java.lang.String text, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(text);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_printText, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 
	* print specified word,take effect on this time
	* @param text:			the word what you want print
	* @param typeface:		font name(only font 'gh' was supported right now)
	* @param fontsize:		font size
	*/
@Override public void printTextWithFont(java.lang.String text, java.lang.String typeface, float fontsize, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(text);
_data.writeString(typeface);
_data.writeFloat(fontsize);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_printTextWithFont, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* print a line of a table ,you can setting col width、alignment.
	* 
	* @param colsTextArr   characters array of each col.
	* @param colsWidthArr  array of each colos(calculate by alphabetical,)
	* @param colsAlign	    cols alignment,0--align left,1--align center,2--align righ
	* 
	* Note:the array lenth of three params should be accordance, if the lenth of colsText[i] is larger than colsWidth[i],the word will reline
	*/
@Override public void printColumnsText(java.lang.String[] colsTextArr, int[] colsWidthArr, int[] colsAlign, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStringArray(colsTextArr);
_data.writeIntArray(colsWidthArr);
_data.writeIntArray(colsAlign);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_printColumnsText, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 
	*print picture
	* @param bitmap: 	The maximum width 384 pixels, it will callback exception while over the pixels.
	*/
@Override public void printBitmap(android.graphics.Bitmap bitmap, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((bitmap!=null)) {
_data.writeInt(1);
bitmap.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_printBitmap, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 
	* print one dimensional code
	* @param data: 		 data of code
	* @param symbology: 	 code type
	*    0 -- UPC-A，
	*    1 -- UPC-E，
	*    2 -- JAN13(EAN13)，
	*    3 -- JAN8(EAN8)，
	*    4 -- CODE39，
	*    5 -- ITF，
	*    6 -- CODABAR，
	*    7 -- CODE93，
	*    8 -- CODE128
	* @param height: 		The height of bar code , data range 1 to 255, default value is 162
	* @param width: 		The width of bar code,data range 2 to 6,default value is 2
	* @param textposition:	Text-align 0--don't print, 1-- word above the barcode,2--word below the barcode 3.both word above and below 
	*/
@Override public void printBarCode(java.lang.String data, int symbology, int height, int width, int textposition, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(data);
_data.writeInt(symbology);
_data.writeInt(height);
_data.writeInt(width);
_data.writeInt(textposition);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_printBarCode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* print qr-code
	* @param data:			qr-code data
	* @param modulesize:	size of qr-code(Unit:point, data range 1 to 16 )
	* @param errorlevel:	error correction level of qr-code(0 to 3)，
	*                0 -- error correction level L ( 7%)，
	*                1 -- error correction level M (15%)，
	*                2 -- error correction level Q (25%)，
	*                3 -- error correction level H (30%) 
	*/
@Override public void printQRCode(java.lang.String data, int modulesize, int errorlevel, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(data);
_data.writeInt(modulesize);
_data.writeInt(errorlevel);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_printQRCode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 
	* print word, automatic reline while the line is full.
	* @param text:	 the characters of word what you want print 
	* 
	*/
@Override public void printOriginalText(java.lang.String text, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(text);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_printOriginalText, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 
	* Print the buffer content
	*/
@Override public void commitPrinterBuffer() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_commitPrinterBuffer, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 
	* go into buffer mode,all the print calling will be storage, do printing after call commitPrinterBuffe()
	* @param clean:  whether fresh the buffer
	* 
	*/
@Override public void enterPrinterBuffer(boolean clean) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((clean)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_enterPrinterBuffer, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 
	* exit buffer mode
	* @param commit: whether print the buffer content
	* 
	*/
@Override public void exitPrinterBuffer(boolean commit) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((commit)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_exitPrinterBuffer, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_updateFirmware = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getFirmwareStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getServiceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_printerInit = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_printerSelfChecking = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getPrinterSerialNo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getPrinterVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getPrinterModal = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getPrintedLength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_lineWrap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_sendRAWData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_setAlignment = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_setFontName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_setFontSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_printText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_printTextWithFont = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_printColumnsText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_printBitmap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_printBarCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_printQRCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_printOriginalText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_commitPrinterBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_enterPrinterBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_exitPrinterBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
}
/**
	* 
	* Printer firmware update(called by system,developer can't call it)
	* @param buffer			
	* @param size
	* @param filename
	* @param iapInterface
	*/
public void updateFirmware() throws android.os.RemoteException;
public int getFirmwareStatus() throws android.os.RemoteException;
/**
	* 
	* Getting WoyouService version
	*/
public java.lang.String getServiceVersion() throws android.os.RemoteException;
/**
	 * 
	 * 
	 * Init printer,reset printer's logical program,but don't fresh the cash,the printing work will go on after reset
	 * @param callback 
	 * @return
	 */
public void printerInit(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 
	* Printer self-inspection, the printer will print a page
	* @param callback 
	*/
public void printerSelfChecking(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 
	* Getting the printer board serial number
	*/
public java.lang.String getPrinterSerialNo() throws android.os.RemoteException;
/**
	* 
	* Getting the printer firmware version
	*/
public java.lang.String getPrinterVersion() throws android.os.RemoteException;
/**
	* 
	* Getting the printer model
	*/
public java.lang.String getPrinterModal() throws android.os.RemoteException;
/**
	* 
	* Getting the print head's  printing length 
	*/
public void getPrintedLength(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	 * 
	 * running a paper(force a newline,running n line before stop)
	 * @param n:	line number
	 * @param callback  
	 * @return
	 */
public void lineWrap(int n, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 
	* Using original caommand
	* @param data	        command
	* @param callback  
	*/
public void sendRAWData(byte[] data, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 
	* Set the alignment mode, affect the later priting ,unless you are initialized
	* @param alignment:	alignment 0--align left , 1--align center, 2--align right
	* @param callback  
	*/
public void setAlignment(int alignment, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 
	* set print font ,take affect on the later printing,unless you initialize the printer(support only one font 'gh' ,gh is a Chinese font,more fonts will be supported later)
	* @param typeface:		font name
	*/
public void setFontName(java.lang.String typeface, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* setting font size ,afect the later printig ,unless you are initialized.
	* Note: setting font size is a method over international standard cammand
	* Adjust the font size will affect the character width,the number of characters per line will also change
	* @param fontsize:	
	*/
public void setFontSize(float fontsize, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* print line ,automatic reline at the end of line. The line of characters will not be printed unless you forcing a newline
	* @param characters:	 characters of word what you want print
	*/
public void printText(java.lang.String text, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 
	* print specified word,take effect on this time
	* @param text:			the word what you want print
	* @param typeface:		font name(only font 'gh' was supported right now)
	* @param fontsize:		font size
	*/
public void printTextWithFont(java.lang.String text, java.lang.String typeface, float fontsize, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* print a line of a table ,you can setting col width、alignment.
	* 
	* @param colsTextArr   characters array of each col.
	* @param colsWidthArr  array of each colos(calculate by alphabetical,)
	* @param colsAlign	    cols alignment,0--align left,1--align center,2--align righ
	* 
	* Note:the array lenth of three params should be accordance, if the lenth of colsText[i] is larger than colsWidth[i],the word will reline
	*/
public void printColumnsText(java.lang.String[] colsTextArr, int[] colsWidthArr, int[] colsAlign, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 
	*print picture
	* @param bitmap: 	The maximum width 384 pixels, it will callback exception while over the pixels.
	*/
public void printBitmap(android.graphics.Bitmap bitmap, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 
	* print one dimensional code
	* @param data: 		 data of code
	* @param symbology: 	 code type
	*    0 -- UPC-A，
	*    1 -- UPC-E，
	*    2 -- JAN13(EAN13)，
	*    3 -- JAN8(EAN8)，
	*    4 -- CODE39，
	*    5 -- ITF，
	*    6 -- CODABAR，
	*    7 -- CODE93，
	*    8 -- CODE128
	* @param height: 		The height of bar code , data range 1 to 255, default value is 162
	* @param width: 		The width of bar code,data range 2 to 6,default value is 2
	* @param textposition:	Text-align 0--don't print, 1-- word above the barcode,2--word below the barcode 3.both word above and below 
	*/
public void printBarCode(java.lang.String data, int symbology, int height, int width, int textposition, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* print qr-code
	* @param data:			qr-code data
	* @param modulesize:	size of qr-code(Unit:point, data range 1 to 16 )
	* @param errorlevel:	error correction level of qr-code(0 to 3)，
	*                0 -- error correction level L ( 7%)，
	*                1 -- error correction level M (15%)，
	*                2 -- error correction level Q (25%)，
	*                3 -- error correction level H (30%) 
	*/
public void printQRCode(java.lang.String data, int modulesize, int errorlevel, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 
	* print word, automatic reline while the line is full.
	* @param text:	 the characters of word what you want print 
	* 
	*/
public void printOriginalText(java.lang.String text, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 
	* Print the buffer content
	*/
public void commitPrinterBuffer() throws android.os.RemoteException;
/**
	* 
	* go into buffer mode,all the print calling will be storage, do printing after call commitPrinterBuffe()
	* @param clean:  whether fresh the buffer
	* 
	*/
public void enterPrinterBuffer(boolean clean) throws android.os.RemoteException;
/**
	* 
	* exit buffer mode
	* @param commit: whether print the buffer content
	* 
	*/
public void exitPrinterBuffer(boolean commit) throws android.os.RemoteException;
}
