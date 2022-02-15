package com.co.waires.wAires.domain.mapper;


import com.co.waires.wAires.domain.dto.ClientTypeDTO;
import com.co.waires.wAires.persistence.entity.ClientType;

import java.util.List;

public interface IClientTypeMapper {

    ClientTypeDTO mapFromEntity(ClientType client);

    List<ClientTypeDTO> mapListClientType(List<ClientType> listClient);

}
