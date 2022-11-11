package vjezba3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSensor {
    private Sensor sensor;

    @BeforeEach
    public void setup() {
        sensor = new Sensor("Test sensor", 10, 0, 100, "Andela");
    }

    @Test
    public void getTitle_shouldReturnSensorTitle() {
        String expectedTitle = "Test sensor";
        assertEquals(expectedTitle, sensor.getTitle());
    }

    @Test
    public void getFactor_shouldReturnSensorFactor() {
        int expectedFactor = 10;
        assertEquals(expectedFactor, sensor.getFactor());
    }

    @Test
    public void getMin_shouldReturnSensorMinimumValue() {
        int expectedMin = 0;
        assertEquals(expectedMin, sensor.getMin());
    }

    @Test
    public void getMax_shouldReturnSensorMaximumValue() {
        int expectedMax = 100;
        assertEquals(expectedMax, sensor.getMax());
    }

    @Test
    public void getUnit_shouldReturnSensorUnit() {
        String expectedUnit = "Andela";
        assertEquals(expectedUnit, sensor.getUnit());
    }

    @Test
    public void getValue_shouldReturnValueBetweenMinAndMax() {
        double returnValue = sensor.getValue();
        assertTrue(returnValue >= sensor.getMin() && returnValue <= sensor.getMax() );
    }


}
