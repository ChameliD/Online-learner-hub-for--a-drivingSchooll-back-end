package com.newsampath.driving.school.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
@Table
public class Appoinments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Date appoinmentDate;

    @Column
    private Time appoinmentTime;

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
}
