package com.newsampath.driving.school.repository;

import com.newsampath.driving.school.model.Appoinments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppoinmentRepository extends JpaRepository<Appoinments,Long> {
}
