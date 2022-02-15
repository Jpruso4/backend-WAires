package com.co.waires.wAires.domain.mapper;

import com.co.waires.wAires.domain.dto.ClientDTO;
import com.co.waires.wAires.persistence.entity.Client;

import java.util.List;

public interface IClientMapper {

    ClientDTO mapFromEntity(Client client);

    Client mapFromDTO(ClientDTO clientDTO);

    List<ClientDTO> mapListClient(List<Client> listClient);

}
