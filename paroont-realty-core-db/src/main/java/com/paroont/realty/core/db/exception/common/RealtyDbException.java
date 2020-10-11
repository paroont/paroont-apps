package com.paroont.realty.core.db.exception.common;

import com.paroont.core.db.exception.common.CoreDbException;

/*
Base DB Exception for Realty App.
 */
public class RealtyDbException extends CoreDbException {
    public RealtyDbException(String message) {
        super(message);
    }

    public RealtyDbException(String message, Throwable cause) {
        super(message, cause);
    }

    public RealtyDbException(Throwable cause) {
        super(cause);
    }
}
