import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Notification Information");
        System.out.println("1. Email Notification");
        System.out.println("2. SMS Notification");
        System.out.println("3. Push Notification");

        System.out.print("Choose a type : ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Enter a number.");
            scanner.close();
            return;
        }

        int choice = scanner.nextInt();

        Notification notification = null;

        switch (choice) {
            case 1:
                notification = new EmailNotification();
                break;

            case 2:
                notification = new SMSNotification();
                break;

            case 3:
                notification = new PushNotification();
                break;

            default:
                System.out.println("Invalid option! Choose between 1 and 3.");
                break;
        }

        if (notification != null) {
            notification.sendNotification();
        }

        scanner.close();
    }
}