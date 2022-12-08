package vjezba4.contreoller;

import java.util.List;
import java.util.Set;

import javax.persistence.NamedStoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import vjezba4.entitiy.Device;
import vjezba4.entitiy.Measure;
import vjezba4.repositories.DeviceRepository;
import vjezba4.repositories.MeasureRepository;
import vjezba4.services.DeviceService;

@RestController
public class DeviceController {
    //private DeviceRepository r=new DeviceRepository();
    @Autowired
    private DeviceService service;
    @GetMapping("/")
    public String start() {
        return "Electric Measure";
    }
    @GetMapping("/listdevices")
    public List<Device> listAll(){
        return service.findAllDevices();
    }
    @PostMapping("/addDevice")
    @ResponseStatus(HttpStatus.CREATED)
    public Device addDevice(@RequestBody Device d) {
        service.addDevice(d);
        return d;
    }
}