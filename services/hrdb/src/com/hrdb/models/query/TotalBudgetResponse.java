/*\/**
 * Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 * This software is the confidential and proprietary information of wavemaker-com * You shall not disclose such Confidential Information and shall use it only in accordance
 * with the terms of the source code license agreement you entered into with wavemaker.com *\/*/
package com.hrdb.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class TotalBudgetResponse implements Serializable {


    @JsonProperty("C1")
    @ColumnAlias("C1")
    private BigInteger c1;

    public BigInteger getC1() {
        return this.c1;
    }

    public void setC1(BigInteger c1) {
        this.c1 = c1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TotalBudgetResponse)) return false;
        final TotalBudgetResponse totalBudgetResponse = (TotalBudgetResponse) o;
        return Objects.equals(getC1(), totalBudgetResponse.getC1());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getC1());
    }
}