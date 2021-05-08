package com.newsampath.driving.school.controller;

import com.newsampath.driving.school.dto.AppoinmentsDto;
import com.newsampath.driving.school.service.AppoinmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/appoinments")

public class AppoinmentsController {
    @Autowired
    private AppoinmentService appoinmentService;

    @PostMapping
    public ResponseEntity creatAppoinment(@RequestBody AppoinmentsDto appoinmentsDto){
        appoinmentService.creatAppoinment(appoinmentsDto);
        return new ResponseEntity(HttpStatus.OK);
    }


    @GetMapping("/all")
    public ResponseEntity<List<AppoinmentsDto>> showAllAppoinments() {
        return new ResponseEntity<>(appoinmentService.showAllAppoinments(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<AppoinmentsDto> getSingleAppoinment(@PathVariable @RequestBody Long id) {
        return new ResponseEntity<>(appoinmentService.readSingleAppoinment(id), HttpStatus.OK);
    }



}
