package com.newsampath.driving.school.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.time.LocalDate;

public class ApplicantDto {
    private Long id;
    private String idNumber ;
    private String idType;
    private String fullName ;
    private String address ;
    private String telephoneNo;
    private String gender;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate birthDay;
    private String licenceType;
    private Long advance ;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate advancedDate ;
    private String medicalId ;
    private String vehicaleClass ;
    private String description ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getLicenceType() {
        return licenceType;
    }

    public void setLicenceType(String licenceType) {
        this.licenceType = licenceType;
    }

    public Long getAdvance() {
        return advance;
    }

    public void setAdvance(Long advance) {
        this.advance = advance;
    }

    public LocalDate getAdvancedDate() {
        return advancedDate;
    }

    public void setAdvancedDate(LocalDate advancedDate) {
        this.advancedDate = advancedDate;
    }

    public String getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(String medicalId) {
        this.medicalId = medicalId;
    }

    public String getVehicaleClass() {
        return vehicaleClass;
    }

    public void setVehicaleClass(String vehicaleClass) {
        this.vehicaleClass = vehicaleClass;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
