package vjezba3;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int time = 1000;
        int count = 0;

        WaterFlowMeter waterFlowMeter;

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            waterFlowMeter = objectMapper.readValue(new File("waterflowmeter.json"), WaterFlowMeter.class);
            while(count < 5) {
                Thread.sleep(time);
                waterFlowMeter.publish();
                count++;
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

        System.exit(0);
    }
}
