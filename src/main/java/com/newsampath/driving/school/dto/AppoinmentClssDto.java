package com.newsampath.driving.school.dto;

import java.sql.Date;
import java.sql.Time;

public class AppoinmentClssDto {
    private Date appoinmentDate;
    private Time appoinmentTime;
    private String username;
    private int taken;

    public Date getAppoinmentDate() {
        return appoinmentDate;
    }

    public void setAppoinmentDate(Date appoinmentDate) {
        this.appoinmentDate = appoinmentDate;
    }

    public Time getAppoinmentTime() {
        return appoinmentTime;
    }

    public void setAppoinmentTime(Time appoinmentTime) {
        this.appoinmentTime = appoinmentTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getTaken() {
        return taken;
    }

    public void setTaken(int taken) {
        this.taken = taken;
    }
}
