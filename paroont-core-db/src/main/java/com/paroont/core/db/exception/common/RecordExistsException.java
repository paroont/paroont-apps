package com.paroont.core.db.exception.common;

public class RecordExistsException extends CoreDbException{
    public RecordExistsException(String message) {
        super(message);
    }

    public RecordExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public RecordExistsException(Throwable cause) {
        super(cause);
    }
}
