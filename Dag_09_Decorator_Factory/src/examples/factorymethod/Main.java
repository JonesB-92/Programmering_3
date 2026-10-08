package examples.factorymethod;

public class Main {
    public static void main(String[] args) {
        NotificationCreator emailCreator = new EmailCreator();
        NotificationCreator smsCreator = new SmsCreator();

        sendWelcome(emailCreator);
        sendWelcome(smsCreator);
    }

    private static void sendWelcome(NotificationCreator creator) {
        Notification notification = creator.createNotification();
        notification.send("Velkommen til systemet!");
    }
}
