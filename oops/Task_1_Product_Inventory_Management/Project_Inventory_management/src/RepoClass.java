import java.util.HashMap;

public class RepoClass
{
    private HashMap<Integer, ProductDetails> map = new HashMap<>();
    
    public void addallProducts(int id, String name, double price)
    {
        if(id <= 0)
        {
            System.out.println("Product ID must be greater than 0");
            return;
        }

        if(name == null || name.trim().isEmpty())
        {
            System.out.println("Product name cannot be empty");
            return;
        }

        if(!name.matches("[a-zA-Z ]+"))
        {
            System.out.println("Product name should contain only alphabets");
            return;
        }

        if(price <= 0 || Double.isNaN(price) || Double.isInfinite(price))
        {
            System.out.println("Product price must be a valid number greater than 0");
            return;
        }

        if(map.containsKey(id))
        {
            System.out.println("Product already exists");
            return;
        }

        ProductDetails pro = new ProductDetails(id, name, price);
        map.put(id, pro);
        System.out.println("Product added successfully");
        displayAll();
    }


    public void displayAll()
    {
        if (map.isEmpty()) 
        {
            System.out.println("No products available");
            return;
        }
        for(ProductDetails pro : map.values())
        {
            pro.displayProductDetails();
        }
    }
}