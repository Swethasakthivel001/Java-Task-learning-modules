
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PriceManager priceManager = new PriceManager();

        System.out.print("Enter number of product prices: ");
        int count = scanner.nextInt();

        if (count < 0) {
            System.out.println("Number of prices cannot be negative.");
            scanner.close();
            return;
        }

        if (count == 0) {
            System.out.println("No product prices entered.");
            scanner.close();
            return;
        }

        for (int i = 0; i < count; i++) {

            System.out.print("Enter product price " + (i + 1) + ": ");

            double price = scanner.nextDouble();

            if (!Double.isFinite(price) || price < 0) {
                System.out.println("Enter a valid non-negative price.");
                i--;
                continue;
            }

            priceManager.addPrice(price);
        }

        priceManager.displayPrices();

        System.out.println("\nTotal unique prices: "
                + priceManager.getPriceCount());

        scanner.close();
    }
}
