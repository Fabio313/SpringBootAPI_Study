package org.example.controller;

import org.example.constant.Constant;
import org.example.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.service.ClientService;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping(Constant.API_CLIENT)
    public void insert(@RequestBody Client client){
        clientService.save(client);
    }

    @GetMapping(Constant.API_CLIENT)
    public List<Client> findAll(){
        return clientService.findAll();
    }
}
