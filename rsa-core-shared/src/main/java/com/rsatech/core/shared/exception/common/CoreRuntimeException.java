package com.rsatech.core.shared.exception.common;
/*
Base Exception for App.
 */
public class CoreRuntimeException  extends RuntimeException{
    public CoreRuntimeException(String message) {
        super(message);
    }

    public CoreRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoreRuntimeException(Throwable cause) {
        super(cause);
    }
}
