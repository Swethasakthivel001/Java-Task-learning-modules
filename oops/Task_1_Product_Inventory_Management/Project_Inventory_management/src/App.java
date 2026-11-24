import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    public static RepoClass repoclass = new RepoClass();
    public static void main(String[] args) 
    {
        App app = new App();
        boolean flag = true;
        while(flag)
        {
            System.out.println("To display all product details:");
            System.out.println("1. Add products");
            System.out.println("2. Display all products");
            System.out.println("3. Exit");
            System.out.println("Choose an option : ");
            int n = scanner.nextInt();
            scanner.nextLine();
            switch (n){
                case 1:
                    app.addProducts();
                    break;
                case 2:
                    repoclass.displayAll();
                    break;
                case 3:
                    System.out.println("Logged out...");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }

    private void addProducts()
    {
        System.out.println("Enter Product ID : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Product Name : ");
        String name = scanner.nextLine();
        System.out.println("Enter Product Price : ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        repoclass.addallProducts(id,name,price);
    }
}