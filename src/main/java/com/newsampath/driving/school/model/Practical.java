package com.newsampath.driving.school.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table
public class Practical
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long practicalID;
    @Column
    private Date date;
    @Column
    private Time time;

    public Long getPracticalID() {
        return practicalID;
    }

    public void setPracticalID(Long practicalID) {
        this.practicalID = practicalID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
