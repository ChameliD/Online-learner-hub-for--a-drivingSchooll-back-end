package com.newsampath.driving.school.repository;

import com.newsampath.driving.school.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicalRepositary extends JpaRepository<Vehicle,Long> {
}
