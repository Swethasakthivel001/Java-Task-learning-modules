
import java.util.ArrayList;
import java.util.Spliterator;

public class ProductManager {

    private ArrayList<String> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void addProduct(String productName) {

        if (productName == null || productName.trim().isEmpty()) {
            System.out.println("Product name cannot be empty.");
            return;
        }

        products.add(productName);

        System.out.println("Product added successfully!");
    }

    public void displayProducts() {

        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        System.out.println("\n--- Product List ---");

        for (String product : products) {
            System.out.println(product);
        }
    }

    public void splitAndProcessProducts() {

        if (products.isEmpty()) {
            System.out.println("No products available to process.");
            return;
        }

        Spliterator<String> spliterator1 = products.spliterator();

        Spliterator<String> spliterator2 = spliterator1.trySplit();

        System.out.println("\n--- Processing Part 1 ---");

        spliterator1.forEachRemaining(product ->
                System.out.println("Product: " + product)
        );

        System.out.println("\n--- Processing Part 2 ---");

        if (spliterator2 != null) {
            spliterator2.forEachRemaining(product ->
                    System.out.println("Product: " + product)
            );
        }
    }
}