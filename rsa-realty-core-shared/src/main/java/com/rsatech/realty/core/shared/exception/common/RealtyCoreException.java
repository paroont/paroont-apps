package com.rsatech.realty.core.shared.exception.common;

import com.rsatech.core.shared.exception.common.CoreRuntimeException;

/*
Base Exception for Realty App.
 */
public class RealtyCoreException extends CoreRuntimeException {
    public RealtyCoreException(String message) {
        super(message);
    }

    public RealtyCoreException(String message, Throwable cause) {
        super(message, cause);
    }

    public RealtyCoreException(Throwable cause) {
        super(cause);
    }
}
