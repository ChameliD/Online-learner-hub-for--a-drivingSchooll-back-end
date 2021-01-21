package com.newsampath.driving.school.repository;

import com.newsampath.driving.school.model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepositary extends JpaRepository<Applicant,Long> {
}
