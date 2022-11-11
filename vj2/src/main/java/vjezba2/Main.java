package vjezba2;

public class Main {
    public static void main(String[] args) {
        String serverURI = "tcp://localhost:1883";
        String topic = "MJERAC PROTOKA VODE";
        String clientId = "vj2client";

        Sensor[] sensors = new Sensor[]{
                new Sensor("Trenutna temperatura vode", 10, -32668, 32668, "C"),
                new Sensor("Trenutni tlak vode", 1000, 0, 65336, "Bar"),
                new Sensor("Potrosnja u zadnjih 1 min, 10 min, 1 sat, 1 dan", 0, 0, 65336, "liters"),
                new Sensor("Potrosnja u zadnjih 1 tjedan, 1 mjesec, 1 godina", 10, 0, 65336, "m3")
        };

        WaterFlowMeter waterFlowMeter = new WaterFlowMeter(serverURI, topic, clientId, sensors);
        waterFlowMeter.publish();
        System.exit(0);
    }
}
