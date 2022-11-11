package vjezba2;

public class Sensor {
    private String title;
    private int factor;
    private int min;
    private int max;
    private String unit;

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

    public double getValue() {

        return Math.floor(((Math.random() * ((max - min) + 1)) + min )) / Math.max(factor, 1);
    }

    public String getData() {
        return title + '\n' +
                "Factor: " + factor + '\n' +
                "Min: " + min + '\n' +
                "Max: " + max + '\n' +
                "Unit: " + unit + '\n' +
                "Value: " + getValue() + '\n';
    }
}

