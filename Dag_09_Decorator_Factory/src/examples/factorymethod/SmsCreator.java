package examples.factorymethod;

public class SmsCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}

