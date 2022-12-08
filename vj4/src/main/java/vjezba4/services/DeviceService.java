package vjezba4.services;

import vjezba4.entitiy.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vjezba4.repositories.DeviceRepository;

import java.util.List;


@Service
    public class DeviceService {
        private DeviceRepository devices;
        @Autowired
        public DeviceService(DeviceRepository r) {
            devices=r;
        }
        public List<Device> findAllDevices(){
            return devices.getAll();
        }
        public Device findDeviceById(Long x) {
            return devices.getById(x);
        }
        public void deleteDevice(Long x) {
            devices.deleteById(x);
        }
        public void addDevice(Device d) {
            devices.add(d);
        }
}

