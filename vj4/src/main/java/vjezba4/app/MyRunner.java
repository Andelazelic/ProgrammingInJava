package vjezba4.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import vjezba4.entitiy.Measure;
import vjezba4.repositories.MeasureRepository;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private MeasureRepository m;

    @Override
    public void run(String... args) throws Exception {
        Measure mesaure=new Measure(15, "Celsius", null);
        m.add(mesaure);
    }
}
