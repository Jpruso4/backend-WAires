package com.co.waires.wAires.domain.mapper.impl;


import com.co.waires.wAires.domain.dto.ClientTypeDTO;
import com.co.waires.wAires.domain.mapper.IClientTypeMapper;
import com.co.waires.wAires.persistence.entity.ClientType;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class ClientTypeMapper implements IClientTypeMapper {


    @Override
    public ClientTypeDTO mapFromEntity(ClientType client) {
        ClientTypeDTO clientTypeDTO = new ClientTypeDTO();
        clientTypeDTO.setIdTipoCliente(client.getIdTipoCliente());
        clientTypeDTO.setNombreTipoCliente(client.getNombreTipoCliente());
        return clientTypeDTO;
    }

    @Override
    public List<ClientTypeDTO> mapListClientType(List<ClientType> listClient) {
        List<ClientTypeDTO> listClientDTO = new LinkedList<>();
        for (ClientType client : listClient){
            listClientDTO.add(mapFromEntity(client));
        }
        return listClientDTO;
    }
}
