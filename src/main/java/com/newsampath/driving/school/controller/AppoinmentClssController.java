package com.newsampath.driving.school.controller;

import com.newsampath.driving.school.dto.AppoinmentClssDto;
import com.newsampath.driving.school.service.AppoinmentClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/appoinmentClass")

public class AppoinmentClssController {
    @Autowired
    private AppoinmentClassService appoinmentClassService;

    @PostMapping
    public ResponseEntity creatAppoinment(@RequestBody AppoinmentClssDto appoinmentClssDto){
        appoinmentClassService.creatAppoinmentClass(appoinmentClssDto);
        return new ResponseEntity(HttpStatus.OK);
    }


    @GetMapping("/all")
    public ResponseEntity<List<AppoinmentClssDto>> showAllAppoinments () {
        return new ResponseEntity<>(appoinmentClassService.showAllAppoinments(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<AppoinmentClssDto> getSingleAppoinment(@PathVariable @RequestBody Long id) {
        return new ResponseEntity<>(appoinmentClassService.readSingleAppoinmentClass(id), HttpStatus.OK);
    }


}
