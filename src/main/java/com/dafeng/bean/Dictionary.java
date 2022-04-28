package com.dafeng.bean;

public class Dictionary {
    private Integer dataId;

    private Integer dataNo;

    private String dataStatus;

    private String dataName;

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public Integer getDataNo() {
        return dataNo;
    }

    public void setDataNo(Integer dataNo) {
        this.dataNo = dataNo;
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus == null ? null : dataStatus.trim();
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName == null ? null : dataName.trim();
    }
}