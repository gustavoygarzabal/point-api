package com.mym.point.service;

import com.mym.point.dto.ClientDto;
import com.mym.point.entity.ClientEntity;
import com.mym.point.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ClientService {

    private final ClientRepository clientRepository;


    public List<ClientDto> getAllClients(){
        List<ClientEntity> clientEntityList = clientRepository.findAll();
        List< ClientDto> clientDtoList = clientEntityList.stream().map(client -> ClientDto.builder()
                .name(client.getName())
                .id(client.getClientId()).build()).toList();
        return clientDtoList;
    }

    public ClientEntity createClient(String clientName){
        ClientEntity clientEntity = ClientEntity.builder()
                .name(clientName).build();
        clientRepository.save(clientEntity);
        return clientEntity;
    }
}
