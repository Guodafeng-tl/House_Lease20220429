package com.dafeng.bean;

public class House {
    private Integer houseId;

    private String houseName;

    private Integer houseFloor;

    private String houseDescribe;

    private String dataStatus;
    
    private String houseLocation;

    public String getHouseLocation() {
		return houseLocation;
	}

	public void setHouseLocation(String houseLocation) {
		this.houseLocation = houseLocation;
	}

	public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName == null ? null : houseName.trim();
    }

    public Integer getHouseFloor() {
        return houseFloor;
    }

    public void setHouseFloor(Integer houseFloor) {
        this.houseFloor = houseFloor;
    }

    public String getHouseDescribe() {
        return houseDescribe;
    }

    public void setHouseDescribe(String houseDescribe) {
        this.houseDescribe = houseDescribe == null ? null : houseDescribe.trim();
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus == null ? null : dataStatus.trim();
    }
}