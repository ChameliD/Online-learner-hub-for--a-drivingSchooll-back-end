package com.newsampath.driving.school.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

public class Applicant_exame
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long atId;

    @OneToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "examelId",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private WritingExame writingExame;

    @Column
    private String result;

    public Long getAtId() {
        return atId;
    }

    public void setAtId(Long atId) {
        this.atId = atId;
    }

    public WritingExame getWritingExame() {
        return writingExame;
    }

    public void setWritingExame(WritingExame writingExame) {
        this.writingExame = writingExame;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
