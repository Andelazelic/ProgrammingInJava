package vjezba2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SensorTest {
    private Sensor MySensor;

    @BeforeEach
    public void setup() {

        MySensor = new Sensor("Test sensor", 10, 0, 100, "andela");
    }

    @Test
    public void getTitle_shouldReturnSensorTitle() {
        String expectedTitle = "Test sensor";
        assertEquals(expectedTitle, MySensor.getTitle());
    }

    @Test
    public void getFactor_shouldReturnSensorFactor() {
        int expectedFactor = 10;
        assertEquals(expectedFactor, MySensor.getFactor());
    }

    @Test
    public void getMin_shouldReturnSensorMinimumValue() {
        int expectedMin = 0;
        assertEquals(expectedMin, MySensor.getMin());
    }

    @Test
    public void getMax_shouldReturnSensorMaximumValue() {
        int expectedMax = 100;
        assertEquals(expectedMax, MySensor.getMax());
    }

    @Test
    public void getUnit_shouldReturnSensorUnit() {
        String expectedUnit = "andela";
        assertEquals(expectedUnit, MySensor.getUnit());
    }

    @Test
    public void getValue_shouldReturnValueBetweenMinAndMax() {
        double returnValue = MySensor.getValue();
        assertTrue(returnValue >= MySensor.getMin() && returnValue <= MySensor.getMax() );
    }


}
