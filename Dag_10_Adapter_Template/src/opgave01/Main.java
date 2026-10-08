package opgave01;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor censor = new FahrenheitAdapter(new FahrenheitSensor(100));

        System.out.println("Den målte temperatur er " + censor.getTemperature() + "°C");
    }
}
