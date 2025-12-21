package looseCoupling;

public class Main {

    public static void main(String[] args) {

        NotificationSender sender = new SmsNotification(); // or new EmailNotification()
        NotificationService service = new NotificationService(sender);

        service.sendNotification("Your OTP is 123456");
    }
}

