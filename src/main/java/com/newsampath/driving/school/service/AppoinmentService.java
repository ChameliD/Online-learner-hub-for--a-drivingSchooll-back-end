package com.newsampath.driving.school.service;

import com.newsampath.driving.school.dto.AppoinmentsDto;
import com.newsampath.driving.school.exceptions.AppoinmentNotFoundxception;
import com.newsampath.driving.school.model.Appoinments;
import com.newsampath.driving.school.repository.AppoinmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class AppoinmentService {
    @Autowired
    private AuthService authService;
    @Autowired
    private AppoinmentsRepository appoinmentsRepository;



    @Transactional
    public List<AppoinmentsDto> showAllAppoinments(){
        List<Appoinments> appoinments = appoinmentsRepository.findAll();
        return appoinments.stream().map(this::mapFromApoinmentToDto).collect(toList());
    }

    @Transactional
    public void creatAppoinment(AppoinmentsDto appoinmentsDto){
        Appoinments appoinments = mapFromDtoToAppoinment(appoinmentsDto);
        appoinmentsRepository.save(appoinments);
    }

    @Transactional
    public AppoinmentsDto readSingleAppoinment(Long id){
        Appoinments appoinments=appoinmentsRepository.findById(id).orElseThrow(()->new AppoinmentNotFoundxception("For id"+id));
        return mapFromApoinmentToDto(appoinments);
    }

    private AppoinmentsDto mapFromApoinmentToDto(Appoinments appoinments){
        AppoinmentsDto appoinmentsDto=new AppoinmentsDto();
        appoinmentsDto.setAppoinmentDate(appoinments.getAppoinmentDate());
        appoinmentsDto.setAppoinmentTime(appoinments.getAppoinmentTime());
        appoinmentsDto.setUsername(appoinments.getUsername());
        return appoinmentsDto;
    }
    private Appoinments mapFromDtoToAppoinment(AppoinmentsDto appoinmentsDto){
        Appoinments appoinments = new Appoinments();
        appoinments.setAppoinmentDate(appoinmentsDto.getAppoinmentDate());
        appoinments.setAppoinmentTime(appoinmentsDto.getAppoinmentTime());
        User loggedInUser = authService.getCurrentUser().orElseThrow(() -> new IllegalArgumentException("User Not Found"));
        appoinments.setUsername(loggedInUser.getUsername());
        return appoinments;
    }

}
