package com.rsatech.core.db.exception.common;
/*
Base DB Exception for App.
 */
public class CoreDbException extends RuntimeException{
    public CoreDbException(String message) {
        super(message);
    }

    public CoreDbException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoreDbException(Throwable cause) {
        super(cause);
    }
}
