package com.andelazelic.vjezba6_1.services;


import com.andelazelic.vjezba6_1.repositories.ClientRepository;
import com.andelazelic.vjezba6_1.repositories.DeviceRepository;
import com.andelazelic.vjezba6_1.entitites.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class DeviceServiceImplementation implements DeviceService {



    @Autowired
    private DeviceRepository deviceRepository;
    @Autowired
    private ClientRepository clientRepository;


    @Override
    public Device saveDevice(Device device, long id) {
        device.setClient(clientRepository.findById(id).get());
        return deviceRepository.save(device);
    }
    @Override
    public Device getDeviceById(long id) {
        return deviceRepository.findById(id).get();
    }
//    @Override
//    public List<Device> getAllDevices()
//    {
//        List<Device> devices = new ArrayList<Device>();
//        deviceRepository.findAll().forEach(device -> devices.add(device));
//        return devices;
//    }

    @Override
    public Page<Device> getAllDevices(Pageable pageable) {
        return deviceRepository.findAll(pageable);
    }

    @Override
    public Device updateDevice(Device device, long id) {
        Device deviceDB = deviceRepository.findById(id).get();

        if (Objects.nonNull(device.getName())
                && !"".equalsIgnoreCase(
                device.getName())) {
            deviceDB.setName(
                    device.getName());
        }

        return deviceRepository.save(deviceDB);
    }

    @Override
    public void deleteDeviceById(long id) {
        deviceRepository.deleteById(id);
    }



}
