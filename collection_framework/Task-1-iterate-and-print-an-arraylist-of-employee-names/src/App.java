import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        EmployeeManager manager = new EmployeeManager();

        System.out.print("Enter number of employees: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        if (count < 0) {
            System.out.println("Employee count cannot be negative.");
            scanner.close();
            return;
        }

        for (int i = 0; i < count; i++) {

            System.out.print("Enter employee name " + (i + 1) + ": ");

            String name = scanner.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("Employee name cannot be empty.");
                i--;
                continue;
            }

            manager.addEmployee(name);
        }

        manager.displayUsingIterator();

        manager.displayUsingForEach();

        scanner.close();
    }
}
