package com.dafeng.bean;

import java.util.Date;

public class Contract {
    private Integer contractId;

    private String contractContent;

    private Date contractDay;

    private Date contractBegintime;

    private Date contractEndtime;

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getContractContent() {
        return contractContent;
    }

    public void setContractContent(String contractContent) {
        this.contractContent = contractContent == null ? null : contractContent.trim();
    }

    public Date getContractDay() {
        return contractDay;
    }

    public void setContractDay(Date contractDay) {
        this.contractDay = contractDay;
    }

    public Date getContractBegintime() {
        return contractBegintime;
    }

    public void setContractBegintime(Date contractBegintime) {
        this.contractBegintime = contractBegintime;
    }

    public Date getContractEndtime() {
        return contractEndtime;
    }

    public void setContractEndtime(Date contractEndtime) {
        this.contractEndtime = contractEndtime;
    }
}