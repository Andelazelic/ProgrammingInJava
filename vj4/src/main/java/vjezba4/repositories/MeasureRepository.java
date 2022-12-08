package vjezba4.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import vjezba4.entitiy.Device;
import vjezba4.entitiy.Measure;
import vjezba4.repositories.MeasureRepository;

public class MeasureRepository implements MainRepository<Measure> {
    private static List<Measure> measures;
    public MeasureRepository() {
        measures=new ArrayList<>();
    }
    public List<Measure> getAll(){
        return measures;
    }
    public Measure getById(Long x){
        Measure tmp=new Measure();
        for (Measure m :measures) {
            if(m.getDevice_id()==x) {
                tmp=m;
                break;
            }
        }
        return tmp;
    }
    public void add(Measure m) {
        measures.add(m);
    }
    public void deleteById(Long x) {
        for (Measure m : measures) {
            if (m.getDevice_id()==x) {
                measures.remove(m);
                break;
            }
        }
    }
}
