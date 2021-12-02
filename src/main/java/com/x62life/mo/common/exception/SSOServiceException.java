package com.x62life.mo.common.exception;

/*
 * SSOServiceException class is thrown when there is an error during the  ApiAction and service function process 
 */
public class SSOServiceException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public SSOServiceException() {
		super("SSOServiceException is occured.");
	}
	
	public SSOServiceException(String msg) {
		super(msg);
	}
	
	public SSOServiceException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
}
