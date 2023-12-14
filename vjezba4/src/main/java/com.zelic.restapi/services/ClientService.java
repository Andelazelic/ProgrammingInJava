package com.zelic.restapi.services;

import java.util.List;

import com.zelic.restapi.entities.Client;
import org.springframework.stereotype.Service;
import com.zelic.restapi.repository.ClientRepository;
import lombok.*;

@AllArgsConstructor
@Service
public class ClientService {

    private final ClientRepository clients;

    public void addClient(Client c) {
        clients.add(c);
    }

    public List<Client> getAllClients() {
        return clients.getAll();
    }

}
