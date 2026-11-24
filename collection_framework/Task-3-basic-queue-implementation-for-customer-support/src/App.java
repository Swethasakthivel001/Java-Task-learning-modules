
import java.util.PriorityQueue;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PriorityQueue<Customer> customerQueue = new PriorityQueue<>();

        System.out.print("Enter number of customers: ");
        int count = sc.nextInt();
        sc.nextLine();

        if (count <= 0) {
            System.out.println("Please enter a valid number of customers.");
            sc.close();
            return;
        }

        for (int i = 1; i <= count; i++) {

            System.out.println("\nEnter details for customer " + i);

            System.out.print("Enter customer name: ");
            String name = sc.nextLine().trim();

            System.out.print("Enter issue: ");
            String issue = sc.nextLine().trim();

            System.out.print("Enter priority (1-High, 2-Medium, 3-Low): ");
            int priority = sc.nextInt();
            sc.nextLine();

            if (name.isEmpty() || issue.isEmpty()) {
                System.out.println("Name and issue cannot be empty.");
                i--;
                continue;
            }

            if (priority < 1 || priority > 3) {
                System.out.println("Invalid priority. Enter 1, 2, or 3.");
                i--;
                continue;
            }

            Customer customer = new Customer(name, issue, priority, i);

            customerQueue.offer(customer);

            System.out.println("Customer added successfully!");
        }

        System.out.println("\n--- Customer Support Processing ---");

        while (!customerQueue.isEmpty()) {

            Customer customer = customerQueue.poll();

            System.out.println("Serving: " + customer);
        }

        System.out.println("\nAll customers have been served.");

        sc.close();
    }
}