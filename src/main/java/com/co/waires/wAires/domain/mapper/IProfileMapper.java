package com.co.waires.wAires.domain.mapper;

import com.co.waires.wAires.domain.dto.ProfileTypeDTO;
import com.co.waires.wAires.persistence.entity.ProfileType;

import java.util.List;

public interface IProfileMapper {

    ProfileTypeDTO mapFromEntity(ProfileType profile);

    List<ProfileTypeDTO> mapListProfile(List<ProfileType> profileList);
}
