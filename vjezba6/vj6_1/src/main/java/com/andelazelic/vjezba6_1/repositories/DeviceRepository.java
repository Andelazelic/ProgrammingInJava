package com.andelazelic.vjezba6_1.repositories;

import com.andelazelic.vjezba6_1.entitites.Device;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {

    Page<Device> findAll(Pageable pageable);

}
