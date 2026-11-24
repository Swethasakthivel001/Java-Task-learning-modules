
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProductManager manager = new ProductManager();

        System.out.print("Enter number of products: ");
        int count = sc.nextInt();
        sc.nextLine();

        if (count <= 0) {
            System.out.println("Please enter a valid number of products.");
            sc.close();
            return;
        }

        for (int i = 1; i <= count; i++) {

            System.out.print("Enter product " + i + " name: ");

            String productName = sc.nextLine().trim();

            if (productName.isEmpty()) {
                System.out.println("Product name cannot be empty. Try again.");
                i--;
                continue;
            }

            manager.addProduct(productName);
        }

        manager.displayProducts();

        manager.splitAndProcessProducts();

        sc.close();
    }
}