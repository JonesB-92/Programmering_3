package examples.factorymethod;

public class SmsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("SMS sendt: " + message);
    }
}

