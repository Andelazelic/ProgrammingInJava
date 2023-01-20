package com.andelazelic.vjezba6_1.services;

import com.andelazelic.vjezba6_1.entitites.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClientService {

    Client saveClient(Client client, long id);
    Client getClientById(long id);
//    List<Client> getAllClients();
    Page<Client> getAllClients(Pageable pageable);
    Client updateClient(Client client, Long id);
    void deleteClientById(Long id);
}
