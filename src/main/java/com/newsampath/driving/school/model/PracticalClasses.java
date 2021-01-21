package com.newsampath.driving.school.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

public class PracticalClasses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long practicalClassId;

    @OneToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "applicant",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Applicant applicant;

    @OneToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "empID",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Employee employee;

    @OneToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "vehicalId",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Vehicle vehicle;

    public Long getPracticalClassId() {
        return practicalClassId;
    }

    public void setPracticalClassId(Long practicalClassId) {
        this.practicalClassId = practicalClassId;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
