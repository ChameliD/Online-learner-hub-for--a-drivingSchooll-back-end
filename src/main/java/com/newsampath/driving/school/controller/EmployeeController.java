package com.newsampath.driving.school.controller;

import com.newsampath.driving.school.model.Employee;
import com.newsampath.driving.school.repository.EmployeeRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController
{

    @Autowired
    private EmployeeRepositary employeeRepositary;

    //get all employee
    @GetMapping("/employees")
    public List<Employee> getAllEmployees()
    {
        return employeeRepositary.findAll();
    }

    //Create employee REST API
    @PostMapping("/employees")
    public Employee createEmployee (@RequestBody Employee employee)
    {
        return employeeRepositary.save(employee);
    }

    //get employee by ID
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id)
    {
        Employee employee = employeeRepositary.findById(id)
                .orElseThrow(() -> new ResourceAccessException("Employee not exist with id :" +id));
        return ResponseEntity.ok(employee);
    }

    //update employee rest api
    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,@RequestBody Employee employeeDetails)
    {
        Employee employee = employeeRepositary.findById(id)
                .orElseThrow(() -> new ResourceAccessException("Employee not exist with id :" +id));

       employee.setIdNumber(employeeDetails.getIdNumber());
       employee.setIdType(employeeDetails.getIdType());
       employee.setFullName(employeeDetails.getFullName());
       employee.setAddress(employeeDetails.getAddress());
       employee.setTelephoneNo(employeeDetails.getTelephoneNo());
       employee.setEmail(employeeDetails.getEmail());
       employee.setGender(employeeDetails.getGender());
       employee.setBirthDay(employeeDetails.getBirthDay());
       employee.setPosition(employeeDetails.getPosition());
       employee.setSalary(employeeDetails.getSalary());
       employee.setStartDate(employeeDetails.getStartDate());
       employee.setStatus(employeeDetails.getStatus());

        Employee updatedEmployee = employeeRepositary.save(employee);
        return ResponseEntity.ok(updatedEmployee);
    }

    //delete employee rest api
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteEmployee(@PathVariable Long id){
        Employee employee = employeeRepositary.findById(id)
                .orElseThrow(() -> new ResourceAccessException("Employee not exist with id :" +id));
        employeeRepositary.delete(employee);
        Map<String,Boolean> response =new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
