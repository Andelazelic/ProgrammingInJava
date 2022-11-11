package vjezba3;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class WaterFlowMeter {
    @JsonProperty
    private String broker;
    @JsonProperty
    private String topic;
    @JsonProperty
    private String clientId;
    @JsonProperty
    private Sensor[] sensors;

    public WaterFlowMeter() {

    }


    public WaterFlowMeter(String broker, String topic, String clientId, Sensor[] sensors) {
        this.broker = broker;
        this.topic = topic;
        this.clientId = clientId;
        this.sensors = sensors;
    }

    public Sensor[] getSensors() {
        return sensors;
    }

    public void publish() {
        try {
            MqttClient mqttClient = new MqttClient(broker, clientId);
            mqttClient.connect();
            System.out.println("Client connected...");
            for (Sensor sensor : sensors) {
                MqttMessage message = new MqttMessage(sensor.getData().getBytes());
                mqttClient.publish(topic, message);
                System.out.println("Message published!");
            }
            mqttClient.disconnect();
            System.out.println("Client disconnected!");
        } catch (MqttException e) {
            System.out.println(e.getMessage());
        }
    }

}
