package com.paroont.realty.core.shared.exception.property;

import com.paroont.realty.core.shared.exception.common.RealtyCoreException;


public class PropertySearchException extends RealtyCoreException {
    public PropertySearchException(String message) {
        super(message);
    }

    public PropertySearchException(String message, Throwable cause) {
        super(message, cause);
    }

    public PropertySearchException(Throwable cause) {
        super(cause);
    }
}
