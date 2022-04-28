package com.dafeng.bean;

import java.util.Date;

public class Eviction {
    private Integer evictionId;

    private Date evictionDate;

    private String evictionReason;

    private Integer houseId;

    private Integer userId;

    public Integer getEvictionId() {
        return evictionId;
    }

    public void setEvictionId(Integer evictionId) {
        this.evictionId = evictionId;
    }

    public Date getEvictionDate() {
        return evictionDate;
    }

    public void setEvictionDate(Date evictionDate) {
        this.evictionDate = evictionDate;
    }

    public String getEvictionReason() {
        return evictionReason;
    }

    public void setEvictionReason(String evictionReason) {
        this.evictionReason = evictionReason == null ? null : evictionReason.trim();
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}