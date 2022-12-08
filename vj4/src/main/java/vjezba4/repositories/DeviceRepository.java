package vjezba4.repositories;

import vjezba4.entitiy.Device;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


public class DeviceRepository implements MainRepository<Device> {
    private static List<Device> devices=new ArrayList<>();

    public List<Device> getAll() {
        return devices;
    }

    public Device getById(Long x) {
        Device tmp = new Device();
        for (Device d : devices) {
            if (d.getId() == x) {
                tmp=d;
                break;
            }
        }
        return tmp;
    }

    public void add(Device d) {
        devices.add(d);
    }

    public void deleteById(Long x) {
        for (Device d : devices) {
            if (d.getId() == x) {
                devices.remove(d);
            }
        }
    }
}

