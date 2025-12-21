package looseCoupling;

public class NotificationService {

    private NotificationSender notificationSender;

    // Constructor Injection
    public NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void sendNotification(String message) {
        notificationSender.send(message);
    }
}

