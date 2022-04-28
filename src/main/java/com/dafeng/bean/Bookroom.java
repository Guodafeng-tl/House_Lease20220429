package com.dafeng.bean;

import java.util.Date;

public class Bookroom {
    private Integer bookroomId;

    private Date bookroomDate;

    private Integer houseId;

    private Integer userId;

    public Integer getBookroomId() {
        return bookroomId;
    }

    public void setBookroomId(Integer bookroomId) {
        this.bookroomId = bookroomId;
    }

    public Date getBookroomDate() {
        return bookroomDate;
    }

    public void setBookroomDate(Date bookroomDate) {
        this.bookroomDate = bookroomDate;
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