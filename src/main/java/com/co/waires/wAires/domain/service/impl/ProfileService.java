package com.co.waires.wAires.domain.service.impl;

import com.co.waires.wAires.domain.dto.ProfileTypeDTO;
import com.co.waires.wAires.domain.mapper.IProfileMapper;
import com.co.waires.wAires.domain.service.IProfileService;
import com.co.waires.wAires.persistence.repository.IProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService implements IProfileService {

    private final IProfileMapper profileMapper;
    private final IProfileRepository profileRepository;

    public ProfileService(IProfileMapper profileMapper, IProfileRepository profileRepository) {
        this.profileMapper = profileMapper;
        this.profileRepository = profileRepository;
    }

    @Override
    public List<ProfileTypeDTO> getProfiles() {
        return profileMapper.mapListProfile(profileRepository.findAll());
    }

}
