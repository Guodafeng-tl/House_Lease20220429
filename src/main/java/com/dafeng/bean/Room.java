package com.dafeng.bean;

import java.math.BigDecimal;

public class Room {
    private Integer roomId;

    private Integer houseId;

    private String roomName;

    private Integer roomArea;

    private BigDecimal roomPrice;

    private String roomExposure;

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    public Integer getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(Integer roomArea) {
        this.roomArea = roomArea;
    }

    public BigDecimal getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(BigDecimal roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getRoomExposure() {
        return roomExposure;
    }

    public void setRoomExposure(String roomExposure) {
        this.roomExposure = roomExposure == null ? null : roomExposure.trim();
    }
}