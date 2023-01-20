package com.zelic.restapi.controllers;

import com.zelic.restapi.entities.Client;
import com.zelic.restapi.services.ClientService;
import lombok.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@AllArgsConstructor
@Controller
public class ClientController {

    private final ClientService clientService;

    @GetMapping("/clients")
    public List<Client> getAll() {
        return clientService.getAllClients();
    }

    @PostMapping("/clients")
    public void createClient(Client c) {
        clientService.addClient(c);
    }
}
