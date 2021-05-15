package com.newsampath.driving.school.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table
public class AppoinmentClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Date appoinmentDate;
    @Column
    private Time appoinmentTime;
    @Column
    private String username;
    @Column
    private int taken;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
