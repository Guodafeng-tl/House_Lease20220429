package com.dafeng.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Orderform {
    private Integer orderfromId;

    private BigDecimal monthPrice;

    private Date orderformDate;

    private Integer userId;

    private Integer houseId;

    private Integer contractId;

    public Integer getOrderfromId() {
        return orderfromId;
    }

    public void setOrderfromId(Integer orderfromId) {
        this.orderfromId = orderfromId;
    }

    public BigDecimal getMonthPrice() {
        return monthPrice;
    }

    public void setMonthPrice(BigDecimal monthPrice) {
        this.monthPrice = monthPrice;
    }

    public Date getOrderformDate() {
        return orderformDate;
    }

    public void setOrderformDate(Date orderformDate) {
        this.orderformDate = orderformDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }
}