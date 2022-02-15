package com.co.waires.wAires.domain.service.impl;

import com.co.waires.wAires.domain.dto.ClientTypeDTO;
import com.co.waires.wAires.domain.mapper.IClientTypeMapper;
import com.co.waires.wAires.domain.service.IClientTypeService;
import com.co.waires.wAires.persistence.repository.IClientTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientTypeService implements IClientTypeService {

    private final IClientTypeMapper clientTypeMapper;
    private final IClientTypeRepository clientTypeRepository;

    public ClientTypeService(IClientTypeMapper clientTypeMapper, IClientTypeRepository clientTypeRepository) {
        this.clientTypeMapper = clientTypeMapper;
        this.clientTypeRepository = clientTypeRepository;
    }

    @Override
    public List<ClientTypeDTO> getClientType() {
        return clientTypeMapper.mapListClientType(clientTypeRepository.findAll());
    }

}
