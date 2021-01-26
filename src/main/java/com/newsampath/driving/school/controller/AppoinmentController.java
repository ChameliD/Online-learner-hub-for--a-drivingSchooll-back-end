package com.newsampath.driving.school.controller;


import com.newsampath.driving.school.model.Appoinments;
import com.newsampath.driving.school.repository.AppoinmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class AppoinmentController
{
    @Autowired
    private AppoinmentRepository appoinmentRepository;

    //get all appoinments
    @GetMapping("/appoinments")
    public List<Appoinments> getAllAppoinments()
    {
        return appoinmentRepository.findAll();
    }




    //Create appoinments REST API
    @PostMapping("/appoinments")
    public Appoinments createAppoinments(@RequestBody Appoinments appoinment)
    {
        return appoinmentRepository.save(appoinment);
    }

    //get appoinments by ID
    @GetMapping("/appoinments/{id}")
    public ResponseEntity<Appoinments> getAppoinmentsById(@PathVariable Long id)
    {
        Appoinments appoinment = appoinmentRepository.findById(id)
                .orElseThrow(() -> new ResourceAccessException("Appoinment not exist with id :" +id));
        return ResponseEntity.ok(appoinment);
    }
    //update appoinments rest api
    @PutMapping("/appoinments/{id}")
    public ResponseEntity<Appoinments> updateAppoinmentst(@PathVariable Long id,@RequestBody Appoinments appoinmentDetails)
    {
        Appoinments appoinments = appoinmentRepository.findById(id)
                .orElseThrow(() -> new ResourceAccessException("Appoinments not exist with id :" +id));

        appoinments.setAppoinmentDate(appoinmentDetails.getAppoinmentDate());
        appoinments.setAppoinmentTime(appoinmentDetails.getAppoinmentTime());

        Appoinments updatedApplicant = appoinmentRepository.save(appoinments);
        return ResponseEntity.ok(updatedApplicant);
    }


    //delete appoinments rest api
    @DeleteMapping("/appoinments/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteAppoinments(@PathVariable Long id){
        Appoinments appoinments = appoinmentRepository.findById(id)
                .orElseThrow(() -> new ResourceAccessException("Appoinment not exist with id :" +id));
        appoinmentRepository.delete(appoinments);
        Map<String,Boolean> response =new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
