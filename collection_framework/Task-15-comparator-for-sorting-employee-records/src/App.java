
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            List<Employee> employees = new ArrayList<>();

            System.out.print("Enter number of employees: ");

            int count = Integer.parseInt(scanner.nextLine());

            if (count < 0) {
                System.out.println("Number of employees cannot be negative.");
                return;
            }

            for (int i = 0; i < count; i++) {

                System.out.println("\nEnter details of Employee " + (i + 1));

                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                System.out.print("Enter age: ");
                int age = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter salary: ");
                double salary = Double.parseDouble(scanner.nextLine());

                employees.add(new Employee(name, age, salary));
            }

            Comparator<Employee> comparator =
                    new EmployeeSalaryComparator();

            Collections.sort(employees, comparator);

            System.out.println("\nEmployees Sorted by Salary (Descending):");

            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }
}
