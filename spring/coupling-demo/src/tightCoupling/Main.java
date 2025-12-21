package tightCoupling;

public class Main {

    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.sendNotification("EMAIL", "Your order is confirmed!");
    }
}
