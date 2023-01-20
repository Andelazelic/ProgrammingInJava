package com.zelic.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zelic.restapi.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,String> {

}

