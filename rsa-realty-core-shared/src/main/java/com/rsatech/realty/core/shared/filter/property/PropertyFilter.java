package com.rsatech.realty.core.shared.filter.property;

import com.rsatech.realty.core.shared.filter.common.RealtyBaseFilter;

public class PropertyFilter extends RealtyBaseFilter {

    protected long templateId = -99;

    protected long propertyId = -99;

    protected long transactionTypeId = -99;

    public long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(long templateId) {
        this.templateId = templateId;
    }

    public long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(long propertyId) {
        this.propertyId = propertyId;
    }

    public long getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(long transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }
}
