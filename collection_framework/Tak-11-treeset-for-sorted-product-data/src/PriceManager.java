
import java.util.Set;
import java.util.TreeSet;

public class PriceManager {

    private final Set<ProductPrice> prices;

    public PriceManager() {
        prices = new TreeSet<>();
    }

    public boolean addPrice(double price) {

        if (!isValidPrice(price)) {
            System.out.println("Invalid price!");
            return false;
        }

        boolean added = prices.add(new ProductPrice(price));

        if (added) {
            System.out.println("Price added successfully.");
        } else {
            System.out.println("Duplicate price! Already exists.");
        }

        return added;
    }

    private boolean isValidPrice(double price) {
        return Double.isFinite(price) && price >= 0;
    }

    public void displayPrices() {

        if (prices.isEmpty()) {
            System.out.println("No product prices available.");
            return;
        }

        System.out.println("\nProduct prices in ascending order:");

        for (ProductPrice productPrice : prices) {
            System.out.println(productPrice);
        }
    }

    public int getPriceCount() {
        return prices.size();
    }
}
