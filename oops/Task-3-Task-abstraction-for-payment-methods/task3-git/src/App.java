
import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);
    public static RepoClass repo = new RepoClass();

    public static void main(String[] args) {

        App app = new App();

        boolean flag = true;

        while (flag) {

            System.out.println("1. Credit Card Payment");
            System.out.println("2. PayPal Payment");
            System.out.println("3. Exit");

            System.out.println("Choose an option:");

            int n = scanner.nextInt();
            scanner.nextLine();

            switch (n) {

                case 1:
                    app.creditCardPayment();
                    break;

                case 2:
                    app.payPalPayment();
                    break;

                case 3:
                    System.out.println("Exited...");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private void creditCardPayment() {

        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter card number:");
        String cardNumber = scanner.nextLine();

        Payment payment = new CreditCardPayment(amount, cardNumber);

        repo.makePayment(payment);
    }

    private void payPalPayment() {

        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter PayPal email:");
        String email = scanner.nextLine();

        Payment payment = new PayPalPayment(amount, email);

        repo.makePayment(payment);
    }
}
