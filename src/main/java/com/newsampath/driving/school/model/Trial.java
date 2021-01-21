package com.newsampath.driving.school.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table
public class Trial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trialID;

    @Column
    private Date trialDate;

    @Column
    private Time trialTime;

    public Long getTrialID() {
        return trialID;
    }

    public void setTrialID(Long trialID) {
        this.trialID = trialID;
    }

    public Date getTrialDate() {
        return trialDate;
    }

    public void setTrialDate(Date trialDate) {
        this.trialDate = trialDate;
    }

    public Time getTrialTime() {
        return trialTime;
    }

    public void setTrialTime(Time trialTime) {
        this.trialTime = trialTime;
    }
}
