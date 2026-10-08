package opgave01;

/**
 * Den eksisterende klasse (Adaptee), som har en inkompatibel grænseflade.
 * Den måler temperatur i Fahrenheit.
 */
public class FahrenheitSensor implements TemperatureSensor{
    private double temperatureInFahrenheit;

    public FahrenheitSensor(double temperatureInFahrenheit) {
        this.temperatureInFahrenheit = temperatureInFahrenheit;
    }

    @Override
    public double getTemperature() {
        return temperatureInFahrenheit;
    }
}
