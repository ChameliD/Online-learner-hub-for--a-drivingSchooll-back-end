package com.newsampath.driving.school.service;

import com.newsampath.driving.school.dto.EmployeeDto;
import com.newsampath.driving.school.model.Employee;
import com.newsampath.driving.school.repository.EmployeeRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User;

import javax.transaction.Transactional;
import java.time.Instant;

@Service
public class EmployeeService {
    @Autowired
    private AuthService authService;
    @Autowired

    private EmployeeRepositary employeeRepositary;


    @Transactional
    public void createEmployee(EmployeeDto employeeDto){
        Employee employee =mapFromDtoToEmployee(employeeDto);
        employeeRepositary.save(employee);

    }

    private EmployeeDto mapFromEmployeeToDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setIdNumber(employee.getIdNumber());
        employeeDto.setIdType(employee.getIdType());
        employeeDto.setFullName(employee.getFullName());
        employeeDto.setAddress(employee.getAddress());
        employeeDto.setTelephoneNo(employee.getTelephoneNo());
        employeeDto.setEmail(employee.getEmail());
        employeeDto.setGender(employee.getGender());
        employeeDto.setBirthday(employee.getBirthDay());
        employeeDto.setPosition(employee.getPosition());
        employeeDto.setSalary(employee.getSalary());
        employeeDto.setStartDate(employee.getStartDate());
        employeeDto.setStatus(employee.getStatus());
        return employeeDto;
    }

    private Employee mapFromDtoToEmployee(EmployeeDto employeeDto) {

        Employee employee = new Employee();
        employee.setId(employeeDto.getId());
        employee.setIdNumber(employeeDto.getIdNumber());
        employee.setIdType(employeeDto.getIdType());
        employee.setFullName(employeeDto.getFullName());
        employee.setAddress(employeeDto.getAddress());
        employee.setTelephoneNo(employeeDto.getTelephoneNo());
        employee.setEmail(employeeDto.getEmail());
        employee.setGender(employeeDto.getGender());
        employee.setBirthDay(employeeDto.getBirthday());
        employee.setPosition(employeeDto.getPosition());
        employee.setSalary(employeeDto.getSalary());
        employee.setStartDate(employeeDto.getStartDate());
        employee.setStatus(employeeDto.getStatus());

        User loggedInUser = authService.getCurrentUser().orElseThrow(() -> new IllegalArgumentException("User Not Found"));

        return employee;
    }
}
