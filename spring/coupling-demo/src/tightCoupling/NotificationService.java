package tightCoupling;


public class NotificationService {

    public void sendNotification(String type, String message) {

        if ("EMAIL".equalsIgnoreCase(type)) {
            EmailService emailService = new EmailService();
            emailService.sendEmail(message);

        } else if ("SMS".equalsIgnoreCase(type)) {
            SmsService smsService = new SmsService();
            smsService.sendSms(message);
        }
    }
}
