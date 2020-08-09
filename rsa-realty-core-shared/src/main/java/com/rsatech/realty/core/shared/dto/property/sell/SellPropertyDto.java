package com.rsatech.realty.core.shared.dto.property.sell;

import com.rsatech.realty.core.shared.dto.property.common.PostPropertyDto;

public class SellPropertyDto extends PostPropertyDto {


    protected double expectedAmount = -1;


    protected int allInclusiveAmount = -1;
    protected int taxAndGovChargeIncluded = -1;

    public double getExpectedAmount() {
        return expectedAmount;
    }

    public void setExpectedAmount(double expectedAmount) {
        this.expectedAmount = expectedAmount;
    }

    public int getAllInclusiveAmount() {
        return allInclusiveAmount;
    }

    public void setAllInclusiveAmount(int allInclusiveAmount) {
        this.allInclusiveAmount = allInclusiveAmount;
    }

    public int getTaxAndGovChargeIncluded() {
        return taxAndGovChargeIncluded;
    }

    public void setTaxAndGovChargeIncluded(int taxAndGovChargeIncluded) {
        this.taxAndGovChargeIncluded = taxAndGovChargeIncluded;
    }
}
