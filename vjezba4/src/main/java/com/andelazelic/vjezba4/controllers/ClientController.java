package com.andelazelic.vjezba4.controllers;

import com.andelazelic.vjezba4.entitites.Client;
import com.andelazelic.vjezba4.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
   private ClientService clientService;

    @PostMapping("/client")
    public Client saveClient(@RequestBody Client client) {
        return clientService.saveClient(client);

    }

    @GetMapping("/client/{id}")
    public Client getClient(@PathVariable("id")long id) {

       return clientService.getClientById(id);
    }

    @GetMapping("/client")
    private List<Client> getAllClients()
    {
        return clientService.getAllClients();
    }



}
