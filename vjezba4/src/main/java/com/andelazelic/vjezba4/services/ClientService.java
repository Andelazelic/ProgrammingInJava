package com.andelazelic.vjezba4.services;

import com.andelazelic.vjezba4.entitites.Client;

import java.util.List;

public interface ClientService {

    Client saveClient(Client client);
    Client getClientById(long id);
    List<Client> getAllClients();

}
