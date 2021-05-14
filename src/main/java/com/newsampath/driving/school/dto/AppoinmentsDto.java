package com.newsampath.driving.school.dto;

import java.sql.Date;
import java.sql.Time;
public class AppoinmentsDto
{
    private Date appoinmentDate;
    private Time appoinmentTime;
    private String username;

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
}
