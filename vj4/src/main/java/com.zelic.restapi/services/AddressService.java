package com.zelic.restapi.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zelic.restapi.entities.Address;
import com.zelic.restapi.entities.Device;
import com.zelic.restapi.repository.AddressRepository;
import com.zelic.restapi.repository.DeviceRepository;

@Service
public class AddressService {
    @Autowired
    private AddressRepository repository;

    public Address createAddress(Address c) {
        return repository.save(c);
    }

    public List<Address> getAddress() {
        return repository.findAll();
    }

    public void deleteAddress(String id) {
        repository.deleteById(id);
    }

    public Address updateAddress(String id, Address details) {
        Address a = repository.findById(id).get();
        a.setCity(details.getCity());
        a.setNumber(details.getNumber());
        a.setStreet(details.getStreet());
        return repository.save(a);
    }
}



