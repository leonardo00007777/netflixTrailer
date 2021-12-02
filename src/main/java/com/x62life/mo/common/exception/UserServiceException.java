package com.x62life.mo.common.exception;

public class UserServiceException extends Exception {
	private static final long serialVersionUID = 1L;
	private String message;
	private static final String ERROR_DESC="Exception Occured in the User Service Implementation";
	
	public UserServiceException()
	{
		super(ERROR_DESC);
	}
    public UserServiceException(final String message) {
        super(message);
    	this.message = message;
    }
    
    public UserServiceException(final String message, final Throwable throwable) {
        super(throwable);
        this.message = message;
    }
    
    public final String getMessage() {
        return (this.getCause() != null) ? this.getCause().toString()
            : this.message;
    }
}
