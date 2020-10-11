package com.paroont.core.shared.exception.common;

public class CoreEnumException extends CoreRuntimeException{
    public CoreEnumException(String message) {
        super(message);
    }

    public CoreEnumException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoreEnumException(Throwable cause) {
        super(cause);
    }
}
