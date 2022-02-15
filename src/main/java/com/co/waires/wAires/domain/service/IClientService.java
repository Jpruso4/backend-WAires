package com.co.waires.wAires.domain.service;

import com.co.waires.wAires.domain.dto.ClientDTO;

import java.util.List;

public interface IClientService {

    ClientDTO getClientById(String numDocumento);

    List<ClientDTO> getClients();

    ClientDTO createClient(ClientDTO clientDTO);

    ClientDTO modifiedClient(ClientDTO clientDTO);

    ClientDTO deleteClient(String numDocumento);

}
