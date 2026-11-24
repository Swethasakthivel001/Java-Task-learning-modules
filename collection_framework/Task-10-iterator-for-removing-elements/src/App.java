
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        NumberManager manager = new NumberManager();

        System.out.print("Enter number of elements: ");
        int count = scanner.nextInt();

        if (count < 0) {
            System.out.println("Number of elements cannot be negative.");
            scanner.close();
            return;
        }

        for (int i = 0; i < count; i++) {

            System.out.print("Enter number " + (i + 1) + ": ");

            int number = scanner.nextInt();

            manager.addNumber(number);
        }

        System.out.println("\nOriginal list:");
        manager.displayNumbers();

        manager.removeEvenNumbers();

        System.out.println("\nAfter removing even numbers:");
        manager.displayNumbers();

        scanner.close();
    }
}
