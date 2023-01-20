package com.zelic.restapi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zelic.restapi.entities.Device;
@Repository
public interface DeviceRepository extends JpaRepository<Device, String> {

}

