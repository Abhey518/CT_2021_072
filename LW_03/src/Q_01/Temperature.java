package Q_01;

public class Temperature {
    private double celsius;

    //NO-Arg Constructor
    public Temperature () {

        this.celsius = 0.0;
    }

    // Parameterized Constructor
    public Temperature(double celsius) {

        this.celsius = celsius;
    }

    //Getter for Celsius
    public double toCelsius() {

        return this.celsius;
    }

    //Getter for Fahrenheit
    public double toFahrenheit() {

        return this.celsius * 9 / 5 + 32;
    }

    // Setter for Celsius
    public void setCelsius(double celsius) {

        this.celsius = celsius;
    }

    // Setter for Fahrenheit
    public void setFahrenheit(double fahrenheit) {

        this.celsius = (fahrenheit - 32) * 5 / 9;
    }

}

