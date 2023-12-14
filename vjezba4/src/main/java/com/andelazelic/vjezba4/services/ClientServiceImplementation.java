package com.andelazelic.vjezba4.services;

import com.andelazelic.vjezba4.entitites.Client;
import com.andelazelic.vjezba4.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ClientServiceImplementation  implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }


    @Override
    public Client getClientById(long id) {
        return clientRepository.findById(id).get();
    }

    @Override
    public List<Client> getAllClients()
    {
        List<Client> clients = new ArrayList<Client>();
        clientRepository.findAll().forEach(client -> clients.add(client));
        return clients;
    }


}