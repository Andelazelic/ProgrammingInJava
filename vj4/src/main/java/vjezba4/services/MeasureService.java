package vjezba4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vjezba4.entitiy.Measure;
import vjezba4.repositories.MeasureRepository;
@Service
public class MeasureService {

    MeasureRepository measures;
    @Autowired
    public MeasureService(MeasureRepository m) {
        measures=m;
    }
    public List<Measure>getAllMeasures(){
        return measures.getAll();
    }
    public Measure findMeasureById(Long x) {
        return measures.getById(x);
    }
    public void deleteMeasure(Long x) {
        measures.deleteById(x);
    }
    public void addMeasure(Measure m) {
        measures.add(m);
    }
}
