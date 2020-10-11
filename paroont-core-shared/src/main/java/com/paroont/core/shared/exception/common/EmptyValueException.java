package com.paroont.core.shared.exception.common;

public class EmptyValueException  extends CoreRuntimeException{
    public EmptyValueException(String message) {
        super(message);
    }

    public EmptyValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyValueException(Throwable cause) {
        super(cause);
    }
}
