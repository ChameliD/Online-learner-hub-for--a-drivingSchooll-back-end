package com.newsampath.driving.school.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;

public class WritingExame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exameID;

    @Column
    private Date exameDate;

    @Column
    private Time exameTime;

    public Long getExameID() {
        return exameID;
    }

    public void setExameID(Long exameID) {
        this.exameID = exameID;
    }

    public Date getExameDate() {
        return exameDate;
    }

    public void setExameDate(Date exameDate) {
        this.exameDate = exameDate;
    }

    public Time getExameTime() {
        return exameTime;
    }

    public void setExameTime(Time exameTime) {
        this.exameTime = exameTime;
    }
}
