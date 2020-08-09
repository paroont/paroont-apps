package com.rsatech.realty.core.shared.dto.property.rent;

import com.rsatech.realty.core.shared.dto.property.common.PostPropertyDto;

public class RentPropertyDto extends PostPropertyDto {

    protected int heavyDeposit = -1;
    protected float expectedDepositAmount = -1;
    protected float expectedRentAmount = -1;

    public int getHeavyDeposit() {
        return heavyDeposit;
    }

    public void setHeavyDeposit(int heavyDeposit) {
        this.heavyDeposit = heavyDeposit;
    }

    public float getExpectedDepositAmount() {
        return expectedDepositAmount;
    }

    public void setExpectedDepositAmount(float expectedDepositAmount) {
        this.expectedDepositAmount = expectedDepositAmount;
    }

    public float getExpectedRentAmount() {
        return expectedRentAmount;
    }

    public void setExpectedRentAmount(float expectedRentAmount) {
        this.expectedRentAmount = expectedRentAmount;
    }
}
