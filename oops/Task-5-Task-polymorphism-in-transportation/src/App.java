import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vehicle Information");
        System.out.println("1. Car");
        System.out.println("2. Truck");
        System.out.println("3. Bike");

        System.out.print("Choose a vehicle number to know the information: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a number.");
            scanner.close();
            return;
        }

        int n = scanner.nextInt();

        Vehicle vehicle = null;

        switch (n) {

            case 1:
                vehicle = new Car();
                break;

            case 2:
                vehicle = new Truck();
                break;

            case 3:
                vehicle = new Bike();
                break;

            default:
                System.out.println("Invalid option! Please choose between 1 and 3.");
                break;
        }

        if (vehicle != null) {
            vehicle.move();
        }

        scanner.close();
    }
}