
public class ProductPrice implements Comparable<ProductPrice> {

    private final double price;

    public ProductPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(ProductPrice other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return "Price: " + price;
    }
}
