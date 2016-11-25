/**
* JIUI V1 Pint service
* AIDL Version: 1.1
*/

package woyou.aidlservice.jiuiv5;

import woyou.aidlservice.jiuiv5.ICallback;
import android.graphics.Bitmap;

interface IWoyouService
{	
	/**
	* 
	* Printer firmware update(called by system,developer can't call it)
	* @param buffer			
	* @param size
	* @param filename
	* @param iapInterface
	*/	
	void updateFirmware();
	
	/**
	* 
	* Printer firmware status
	* return:   0--unknow， A5--bootloader, C3--print
	*/
	int getFirmwareStatus();
	
	/**
	* 
	* Getting WoyouService version
	*/
	String getServiceVersion();	
	
	/**
	 * 
	 * 
	 * Init printer,reset printer's logical program,but don't fresh the cash,the printing work will go on after reset
	 * @param callback 
	 * @return
	 */
	void printerInit(in ICallback callback);
			
	/**
	* 
	* Printer self-inspection, the printer will print a page
	* @param callback 
	*/
	void printerSelfChecking(in ICallback callback);
	
	/**
	* 
	* Getting the printer board serial number
	*/		
	String getPrinterSerialNo();
	
	/**
	* 
	* Getting the printer firmware version
	*/
	String getPrinterVersion();	
	
	/**
	* 
	* Getting the printer model
	*/		
	String getPrinterModal();
	
	/**
	* 
	* Getting the print head's  printing length 
	*/
	void getPrintedLength(in ICallback callback);
		
	/**
	 * 
	 * running a paper(force a newline,running n line before stop)
	 * @param n:	line number
	 * @param callback  
	 * @return
	 */
	void lineWrap(int n, in ICallback callback);
				
	/**
	* 
	* Using original caommand
	* @param data	        command
	* @param callback  
	*/
	void sendRAWData(in byte[] data, in ICallback callback);
	
	/**
	* 
	* Set the alignment mode, affect the later priting ,unless you are initialized
	* @param alignment:	alignment 0--align left , 1--align center, 2--align right
	* @param callback  
	*/
	void setAlignment(int alignment, in ICallback callback);

	/**
	* 
	* set print font ,take affect on the later printing,unless you initialize the printer(support only one font 'gh' ,gh is a Chinese font,more fonts will be supported later)
	* @param typeface:		font name
	*/
	void setFontName(String typeface, in ICallback callback);
	
	/**
	* setting font size ,afect the later printig ,unless you are initialized.
	* Note: setting font size is a method over international standard cammand
	* Adjust the font size will affect the character width,the number of characters per line will also change
	* @param fontsize:	
	*/
	void setFontSize(float fontsize, in ICallback callback);
	
	/**
	* print line ,automatic reline at the end of line. The line of characters will not be printed unless you forcing a newline
	* @param characters:	 characters of word what you want print
	*/
	void printText(String text, in ICallback callback);

	/**
	* 
	* print specified word,take effect on this time
	* @param text:			the word what you want print
	* @param typeface:		font name(only font 'gh' was supported right now)
	* @param fontsize:		font size
	*/
	void printTextWithFont(String text, String typeface, float fontsize, in ICallback callback);

	/**
	* print a line of a table ,you can setting col width、alignment.
	* 
	* @param colsTextArr   characters array of each col.
	* @param colsWidthArr  array of each colos(calculate by alphabetical,)
	* @param colsAlign	    cols alignment,0--align left,1--align center,2--align righ
	* 
	* Note:the array lenth of three params should be accordance, if the lenth of colsText[i] is larger than colsWidth[i],the word will reline
	*/
	void printColumnsText(in String[] colsTextArr, in int[] colsWidthArr, in int[] colsAlign, in ICallback callback);

	
	/**
	* 
	*print picture
	* @param bitmap: 	The maximum width 384 pixels, it will callback exception while over the pixels.
	*/
	void printBitmap(in Bitmap bitmap, in ICallback callback);
	
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
	void printBarCode(String data, int symbology, int height, int width, int textposition,  in ICallback callback);
		
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
	void printQRCode(String data, int modulesize, int errorlevel, in ICallback callback);
	
	/**
	* 
	* print word, automatic reline while the line is full.
	* @param text:	 the characters of word what you want print 
	* 
	*/
	void printOriginalText(String text, in ICallback callback);	
	/**
	* 
	* Print the buffer content
	*/
	void commitPrinterBuffer();
	
	/**
	* 
	* go into buffer mode,all the print calling will be storage, do printing after call commitPrinterBuffe()
	* @param clean:  whether fresh the buffer
	* 
	*/
	void enterPrinterBuffer(in boolean clean);
	
	/**
	* 
	* exit buffer mode
	* @param commit: whether print the buffer content
	* 
	*/
	void exitPrinterBuffer(in boolean commit);
}