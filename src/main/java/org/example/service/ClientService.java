package org.example.service;

import org.example.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.repository.IClientRepositoy;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private IClientRepositoy clientRepositoy;

    public void save(Client client){
        try {
            clientRepositoy.save(client);
        }
        catch (Exception ex)
        {
            System.out.print("sefuder");
        }
    }

    public List<Client> findAll(){
        return clientRepositoy.findAll();
    }
}
