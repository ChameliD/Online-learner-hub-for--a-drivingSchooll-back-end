package com.newsampath.driving.school.repository;

import com.newsampath.driving.school.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositary extends JpaRepository<Employee,Long>
{
}
