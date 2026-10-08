package opgave01;

public class FahrenheitAdapter implements TemperatureSensor{
    private FahrenheitSensor fahrenheitSensor;

    public FahrenheitAdapter(FahrenheitSensor fahrenheitSensor) {
        this.fahrenheitSensor = fahrenheitSensor;
    }

    @Override
    public double getTemperature() {
        return (fahrenheitSensor.getTemperature() - 32) * 5 / 9;
    }

}
