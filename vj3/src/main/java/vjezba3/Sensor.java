package vjezba3;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Sensor {
    @JsonProperty
    private String title;
    @JsonProperty
    private int factor;
    @JsonProperty
    private int min;
    @JsonProperty
    private int max;
    @JsonProperty
    private String unit;

    public Sensor() {
    }

    public Sensor(String title, int factor, int min, int max, String unit) {
        this.title = title;
        this.factor = factor;
        this.min = min;
        this.max = max;
        this.unit = unit;
    }

    public String getTitle() {
        return title;
    }

    public int getFactor() {
        return factor;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public String getUnit() {
        return unit;
    }

    @JsonIgnore
    public double getValue() {
        return Math.floor(((Math.random() * ((max - min) + 1)) + min )) / Math.max(factor, 1);
    }

    @JsonIgnore
    public String getData() {
        return title + '\n' +
                "Factor: " + factor + '\n' +
                "Min: " + min + '\n' +
                "Max: " + max + '\n' +
                "Unit: " + unit + '\n' +
                "Value: " + getValue() + '\n';
    }
}
