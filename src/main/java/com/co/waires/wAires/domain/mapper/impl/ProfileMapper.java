package com.co.waires.wAires.domain.mapper.impl;

import com.co.waires.wAires.domain.dto.ProfileTypeDTO;
import com.co.waires.wAires.domain.mapper.IProfileMapper;
import com.co.waires.wAires.persistence.entity.ProfileType;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class ProfileMapper implements IProfileMapper {
    @Override
    public ProfileTypeDTO mapFromEntity(ProfileType profile) {
        ProfileTypeDTO profileDTO = new ProfileTypeDTO();
        profileDTO.setIdPerfil(profile.getIdPefil());
        profileDTO.setNombrePerfil(profile.getNombrePerfil());
        return profileDTO;
    }


    @Override
    public List<ProfileTypeDTO> mapListProfile(List<ProfileType> profileList) {
        List<ProfileTypeDTO> list = new LinkedList<>();
        for (ProfileType profile : profileList) {
            list.add(mapFromEntity(profile));
        }
        return list;
    }
}
