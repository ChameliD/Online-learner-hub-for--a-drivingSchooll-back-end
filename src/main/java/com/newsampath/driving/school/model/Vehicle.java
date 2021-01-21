package com.newsampath.driving.school.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicalId;

    @Column
    private String plateNo;

    @Column
    private int noOfSeat;

    @Column
    private String vehicaleClass;


    public Long getVehicalId() {
        return vehicalId;
    }

    public void setVehicalId(Long vehicalId) {
        this.vehicalId = vehicalId;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public int getNoOfSeat() {
        return noOfSeat;
    }

    public void setNoOfSeat(int noOfSeat) {
        this.noOfSeat = noOfSeat;
    }

    public String getVehicaleClass() {
        return vehicaleClass;
    }

    public void setVehicaleClass(String vehicaleClass) {
        this.vehicaleClass = vehicaleClass;
    }
}
