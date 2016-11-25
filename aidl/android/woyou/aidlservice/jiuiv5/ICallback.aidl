package woyou.aidlservice.jiuiv5;

/**
 * printing server result callback
 */
interface ICallback {

	/**
	* return result
	* @param isSuccess:	  true--Execute successfully ，false--Execute failure
	*/
	oneway void onRunResult(boolean isSuccess);
	
	/**
	* return result(characters)
	* @param result   the length which has been printed since power on (unit: mm)
	*/
	oneway void onReturnString(String result);
	
	/**
	* excute exception
	* code：  exception
	* msg:	exception description
	*/
	oneway void  onRaiseException(int code, String msg);
}