package com.netflix.app.common.exception;

public class MemberServiceException extends Exception {
	private static final long serialVersionUID = 1L;
	private String message;
	private static final String ERROR_DESC="Exception Occured in the User Service Implementation";
	
	public MemberServiceException()
	{
		super(ERROR_DESC);
	}
    public MemberServiceException(final String message) {
        super(message);
    	this.message = message;
    }
    
    public MemberServiceException(final String message, final Throwable throwable) {
        super(throwable);
        this.message = message;
    }
    
    public final String getMessage() {
        return (this.getCause() != null) ? this.getCause().toString()
            : this.message;
    }
}
