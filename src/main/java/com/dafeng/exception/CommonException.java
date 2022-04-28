package com.dafeng.exception;

import java.util.HashMap;
import java.util.Map;

/** 
* @author 作者 Dafeng
* @version 创建时间：2019年3月3日 下午12:27:34 
* 类说明 
*/
public class CommonException extends Exception{
	
	private static final Map<Integer, CommonException> exceptionMap = new HashMap<Integer, CommonException>();
	private static final Map<Integer, String> errmsgMap = new HashMap<Integer, String>();
	private int errcode;
	private String errmsg;
	
	static {
		errmsgMap.put(401, "参数为空!");
		errmsgMap.put(402, "用户名密码错误!");
		errmsgMap.put(403, "参数错误!");
		errmsgMap.put(404, "查询结果为空！");
		exceptionMap.put(501, new CommonException(501, getMessage(501)));
	}
	
	public CommonException(int errcode, String msg) {
		super(msg);
		this.errcode = errcode;
		this.errmsg = msg;
	}

	public int getErrcode() {
		return errcode;
	}
	@Override
	public String getMessage() {
		return errmsg;
	}

	public static String getMessage(int errcode) {
		if (errmsgMap.containsKey(errcode)) {
			return errmsgMap.get(errcode);
		}
		else {
			return errmsgMap.get(501);
		}
	}

	public static CommonException getException(int errcode) {
		if (exceptionMap.containsKey(errcode)) {
			return exceptionMap.get(errcode);
		} else if (errmsgMap.containsKey(errcode)) {
			CommonException ex = new CommonException(errcode, getMessage(errcode));
			exceptionMap.put(errcode, ex);
			return ex;
		} else {
			return exceptionMap.get(501);
			
		}
	}
}
