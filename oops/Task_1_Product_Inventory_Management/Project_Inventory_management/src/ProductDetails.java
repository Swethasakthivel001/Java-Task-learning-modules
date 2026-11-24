public class ProductDetails
{ 
    private int productId;
    private String productName;
    private double price;

    public ProductDetails(int productId, String productName, double price)
    {
        if (productId <= 0) {
            throw new IllegalArgumentException(
                "Product ID must be greater than 0");
        }

        if (productName == null ||
            !productName.matches("[a-zA-Z ]+") ||
            productName.trim().isEmpty()) {

            throw new IllegalArgumentException(
                "Product name should contain only alphabets");
        }

        if (price <= 0 || Double.isNaN(price) ||
            Double.isInfinite(price)) {

            throw new IllegalArgumentException(
                "Price must be greater than 0");
        }

        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId()
    {
        return productId;
    }

    public void setProductId(int productId)
    {
        if (productId <= 0) {
            throw new IllegalArgumentException(
                "Product ID must be greater than 0");
        }

        this.productId = productId;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        if (productName == null ||
            !productName.matches("[a-zA-Z ]+") ||
            productName.trim().isEmpty()) {

            throw new IllegalArgumentException(
                "Invalid product name");
        }

        this.productName = productName;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        if (price <= 0 || Double.isNaN(price) ||
            Double.isInfinite(price)) {

            throw new IllegalArgumentException(
                "Price must be greater than 0");
        }
        
        this.price = price;
    }

    public void displayProductDetails()
    {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
    }

    @Override
    public String toString()
    {
        return "ProductDetails [productId = " + productId + " , productName = " + productName + " , price = " + price + "]";
    }

}