package com.co.waires.wAires.controller;

import com.co.waires.wAires.domain.dto.ProfileTypeDTO;
import com.co.waires.wAires.domain.service.IProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("profile")
public class ProfileController {

    private final IProfileService profileService;

    public ProfileController(IProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/profiles")
    public ResponseEntity<List<ProfileTypeDTO>> getProfiles(){
        return new ResponseEntity(profileService.getProfiles(), HttpStatus.OK);
    }
}
