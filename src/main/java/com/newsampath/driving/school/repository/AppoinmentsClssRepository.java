package com.newsampath.driving.school.repository;

import com.newsampath.driving.school.model.AppoinmentClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppoinmentsClssRepository extends JpaRepository<AppoinmentClass,Long> {
}
