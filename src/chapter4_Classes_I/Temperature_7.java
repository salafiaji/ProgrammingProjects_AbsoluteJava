package chapter4_Classes_I;

public class Temperature_7 {
    private double temperature;
    private char scale;

    public Temperature_7(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    public Temperature_7(char scale) {
        this.scale = scale;
        this.temperature = 0;
    }

    public Temperature_7(double temperature) {
        this.temperature = temperature;
        this.scale = 'C';
    }
    public Temperature_7() {
        this.scale = 'C';
        this.temperature = 0;
    }

    public double getCelsius() {
        if (scale == 'C') {
            return temperature;
        } else {
            return ((double) (Math.round((5 * (temperature - 32) / 9) * 10.0) / 10));
        }

    }

    public double getFahrenheit() {
        if (scale == 'F') {
            return temperature;
        } else {
            return ((double) (Math.round((9 * (temperature / 5) + 32) * 10.0) / 10));
        }

    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setTemperatureAndScale(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Temperature_7)
        {
            Temperature_7 t = (Temperature_7) obj;
            return getCelsius() == t.getCelsius();
        }
        return false;
    }

    // Create a method to test whether one temperature is greater than another.
    public boolean lessThan(Object obj)
    {
        if (obj instanceof Temperature_7)
        {
            Temperature_7 t = (Temperature_7) obj;
            return getCelsius() > t.getCelsius();
        }
        return false;
    }

    // Create a method to test whether one temperature is less than another.
    public boolean greaterThan(Object obj)
    {
        if (obj instanceof Temperature_7)
        {
            Temperature_7 t = (Temperature_7) obj;
            return getCelsius() < t.getCelsius();
        }
        return false;
    }

    public String toString() {
        if (scale == 'C') {
            return String.format("%.1f degrees C = %.1f degrees F", temperature, getFahrenheit());
        } else {
            return String.format("%.1f degrees F = %.1f degrees C", temperature, getCelsius());

        }
    }

    public static void main(String[] args) {
        System.out.println("Celsius to Fahrenheit");
        // Create an object named c2fObj1.
        Temperature_7 c2fObj1 = new Temperature_7();
        c2fObj1.setTemperature(0.00);
        c2fObj1.setScale('C');
        System.out.println(c2fObj1.toString());

        // Create an object named c2fObj2.
        Temperature_7 c2fObj2 = new Temperature_7('C');
        c2fObj2.setTemperature(-40);
        System.out.println(c2fObj2.toString());

        // Create an object named c2fObj3.
        Temperature_7 c2fObj3 = new Temperature_7(100.00, 'C');
        System.out.println(c2fObj3.toString());

        // Create an object named f2cObj1.
        System.out.println("\nFahrenheit to Celsius:");
        Temperature_7 f2cObj1 = new Temperature_7(0);
        f2cObj1.setTemperatureAndScale(56.00, 'F');
        System.out.println(f2cObj1.toString());

        // Display Comparision.
        System.out.println("\nComparision:");
        System.out.println("c2fObj1 < c2fObj2: " + c2fObj1.lessThan(c2fObj2));
        System.out.println("c2fObj2 = c2fObj3: " + c2fObj1.equals(c2fObj3));
        System.out.println("c2fObj3 > f2cObj1: " + c2fObj3.greaterThan(f2cObj1));
    }
}

