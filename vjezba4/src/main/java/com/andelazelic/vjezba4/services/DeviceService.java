package com.andelazelic.vjezba4.services;



import com.andelazelic.vjezba4.entitites.Device;

import java.util.List;

public interface DeviceService {

    Device saveDevice(Device device, long id);
    Device getDeviceById(long id);
    List<Device> getAllDevices();




}
