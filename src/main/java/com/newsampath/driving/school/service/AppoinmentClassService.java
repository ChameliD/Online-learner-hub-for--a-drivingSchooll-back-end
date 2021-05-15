package com.newsampath.driving.school.service;

import com.newsampath.driving.school.dto.AppoinmentClssDto;
import com.newsampath.driving.school.exceptions.AppoinmentNotFoundxception;
import com.newsampath.driving.school.model.AppoinmentClass;
import com.newsampath.driving.school.repository.AppoinmentsClssRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class AppoinmentClassService {
    @Autowired
    private AuthService authService;
    @Autowired
    private AppoinmentsClssRepository appoinmentsClssRepository;



    @Transactional
    public List<AppoinmentClssDto> showAllAppoinments(){
        List<AppoinmentClass> appoinmentClasses = appoinmentsClssRepository.findAll();
        return appoinmentClasses.stream().map(this::mapFromApoinmentToDto).collect(toList());
    }

    @Transactional
    public void creatAppoinmentClass(AppoinmentClssDto appoinmentClssDto){
        AppoinmentClass appoinmentClass = mapFromDtoToAppoinment(appoinmentClssDto);
        appoinmentsClssRepository.save(appoinmentClass);
    }

    @Transactional
    public AppoinmentClssDto readSingleAppoinmentClass(Long id){
        AppoinmentClass appoinmentClass=appoinmentsClssRepository.findById(id).orElseThrow(()->new AppoinmentNotFoundxception("For id"+id));
        return mapFromApoinmentToDto(appoinmentClass);
    }

    private AppoinmentClssDto mapFromApoinmentToDto(AppoinmentClass appoinmentClass){
        AppoinmentClssDto appoinmentClssDto=new AppoinmentClssDto();
        appoinmentClssDto.setAppoinmentDate(appoinmentClass.getAppoinmentDate());
        appoinmentClssDto.setAppoinmentTime(appoinmentClass.getAppoinmentTime());
        appoinmentClssDto.setUsername(appoinmentClass.getUsername());
        appoinmentClssDto.setTaken(appoinmentClass.getTaken());
        return appoinmentClssDto;
    }
    private AppoinmentClass mapFromDtoToAppoinment(AppoinmentClssDto appoinmentClssDto){
        AppoinmentClass appoinmentClass = new AppoinmentClass();
        appoinmentClass.setAppoinmentDate(appoinmentClssDto.getAppoinmentDate());
        appoinmentClass.setAppoinmentTime(appoinmentClssDto.getAppoinmentTime());
        User loggedInUser = authService.getCurrentUser().orElseThrow(() -> new IllegalArgumentException("User Not Found"));
        appoinmentClass.setUsername(loggedInUser.getUsername());
        appoinmentClass.setTaken(appoinmentClssDto.getTaken());
        return appoinmentClass;
    }

}
