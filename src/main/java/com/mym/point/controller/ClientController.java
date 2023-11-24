package com.mym.point.controller;

import com.mym.point.dto.ClientDto;
import com.mym.point.entity.ClientEntity;
import com.mym.point.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;
    @GetMapping()
    public List<ClientDto> getAllClients(){
        List<ClientDto> clients = clientService.getAllClients();
        return clients;
    }

    @PostMapping()
    public ClientEntity createClient(@RequestParam String name){
        ClientEntity clientEntity = clientService.createClient(name);
        return clientEntity;
    }

}