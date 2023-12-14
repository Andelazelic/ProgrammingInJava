package com.zelic.restapi.controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.zelic.restapi.entities.Device;
import com.zelic.restapi.services.DeviceService;
import lombok.*;

@AllArgsConstructor
@Controller
public class DeviceController {

    private final DeviceService deviceService;

    @GetMapping("/devices")
    public List<Device> getAll() {
        return deviceService.getAllDevices();
    }


    @PostMapping("/devices")
    public void createDevice(Device d) {
        deviceService.addDevice(d);
    }
}
