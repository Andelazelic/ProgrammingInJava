package com.zelic.restapi.services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.zelic.restapi.entities.Device;
import com.zelic.restapi.repository.DeviceRepository;

import lombok.*;

@AllArgsConstructor
@Service
public class DeviceService {

    private final DeviceRepository devices;

    public void addDevice(Device d) {
        devices.add(d);
    }

    public List<Device> getAllDevices () {
        return devices.getAll();
    }
}
