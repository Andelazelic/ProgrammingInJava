package com.andelazelic.vjezba6_1.services;



import com.andelazelic.vjezba6_1.entitites.Device;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DeviceService {

    Device saveDevice(Device device, long id);
    Device getDeviceById(long id);
    //List<Device> getAllDevices();

    Page<Device> getAllDevices(Pageable pageable);
    Device updateDevice(Device device, long id);
    void deleteDeviceById(long id);


}
