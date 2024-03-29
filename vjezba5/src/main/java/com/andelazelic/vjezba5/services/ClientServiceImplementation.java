package com.andelazelic.vjezba5.services;

import com.andelazelic.vjezba5.entitites.Client;
import com.andelazelic.vjezba5.repositories.ClientRepository;
import com.andelazelic.vjezba5.repositories.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ClientServiceImplementation  implements ClientService {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private DeviceRepository deviceRepository;

    @Override
    public Client saveClient(Client client, long id) {

        client.setDevice(deviceRepository.findById(id).get());
        return clientRepository.save(client);
    }

    @Override
    public Client getById(long id) {
        return null;
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

    @Override
    public Client updateClient(Client client, Long id)
    {

        Client clientDB = clientRepository.findById(id).get();

        if (Objects.nonNull(client.getName())
                && !"".equalsIgnoreCase(
                client.getName())) {
            clientDB.setName(
                    client.getName());
        }

        if (Objects.nonNull(
                client.getAddress())
                && !"".equalsIgnoreCase(
                client.getAddress())) {
            clientDB.setAddress(
                    client.getAddress());
        }

        return clientRepository.save(clientDB);
    }


    @Override
    public void deleteClientById(Long id) {
        clientRepository.deleteById(id);
    }


}