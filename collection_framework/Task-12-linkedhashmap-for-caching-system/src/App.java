import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cache cache = new Cache();

        while (true) {

            System.out.println("\n===== CACHING SYSTEM =====");
            System.out.println("1. Add Data");
            System.out.println("2. Display Cache");
            System.out.println("3. Get Data");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter cache key: ");
                    int key = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter cache value: ");
                    String value = sc.nextLine();

                    cache.addData(key, value);
                    break;

                case 2:
                    cache.displayCache();
                    break;

                case 3:
                    System.out.print("Enter key to retrieve: ");
                    int searchKey = sc.nextInt();

                    cache.getData(searchKey);
                    break;

                case 4:
                    System.out.println("Exiting caching system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
