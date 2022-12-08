package vjezba4.contreoller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import vjezba4.entitiy.Device;
import vjezba4.entitiy.Measure;
import vjezba4.repositories.MeasureRepository;
import vjezba4.services.MeasureService;

@RestController
public class MeasureController {
    private MeasureRepository m=new MeasureRepository();
    private MeasureService service=new MeasureService(m);
    @GetMapping("/listmeasures")
    public List<Measure> listAll(){
        return service.getAllMeasures();
    }
    @PostMapping("/addMeasure")
    @ResponseStatus(HttpStatus.CREATED)
    public Measure addDevice(@RequestBody Measure d) {
        service.addMeasure(d);
        return d;
    }
}
