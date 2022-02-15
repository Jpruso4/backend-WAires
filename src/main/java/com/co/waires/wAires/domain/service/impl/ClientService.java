package com.co.waires.wAires.domain.service.impl;

import com.co.waires.wAires.domain.dto.ClientDTO;
import com.co.waires.wAires.domain.mapper.IClientMapper;
import com.co.waires.wAires.domain.service.IClientService;
import com.co.waires.wAires.persistence.entity.Client;
import com.co.waires.wAires.persistence.repository.IClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService implements IClientService {

    private final IClientMapper clientMapper;
    private final IClientRepository clientRepository;

    public ClientService(IClientMapper clientMapper, IClientRepository clientRepository) {
        this.clientMapper = clientMapper;
        this.clientRepository = clientRepository;
    }

    @Override
    public ClientDTO getClientById(String numDocumento) {
        Client client = clientRepository.findById(numDocumento).orElseThrow(() -> new RuntimeException("El cliente no fue encontrado"));
        return clientMapper.mapFromEntity(client);
    }

    @Override
    public List<ClientDTO> getClients() {
        List<Client> listClient = clientRepository.findAll();
        return clientMapper.mapListClient(listClient);
    }

    @Override
    public ClientDTO createClient(ClientDTO clientDTO) {
        Client client = clientMapper.mapFromDTO(clientDTO);
        return clientMapper.mapFromEntity(clientRepository.save(client));
    }

    @Override
    public ClientDTO modifiedClient(ClientDTO clientDTO) {
        Client client = clientMapper.mapFromDTO(clientDTO);
        clientRepository.findById(client.getNumDocumento()).orElseThrow(() -> new RuntimeException("El cliente no fue encontrado"));
        return clientMapper.mapFromEntity(clientRepository.save(client));
    }

    @Override
    public ClientDTO deleteClient(String numDocumento) {
        Optional<Client> client = clientRepository.obtenerClienteDocumento(numDocumento);
        if(!client.isPresent()){
            new RuntimeException("El cliente no fue encontrado");
        }
        clientRepository.deleteById(numDocumento);
        return clientMapper.mapFromEntity(client.get());
    }

}
