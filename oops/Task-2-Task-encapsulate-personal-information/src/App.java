
import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static RepoClass repoclass = new RepoClass();

    public static void main(String[] args) {

        App app = new App();

        boolean flag = true;

        while (flag) {

            System.out.println("\n1. Add Person");
            System.out.println("2. Display all Persons");
            System.out.println("3. Exit");

            System.out.println("Choose an option:");

            int n = scanner.nextInt();
            scanner.nextLine();

            switch (n) {

                case 1:
                    app.addPerson();
                    break;

                case 2:
                    repoclass.displayAll();
                    break;

                case 3:
                    System.out.println("Logged out...");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private void addPerson() {

        System.out.println("Enter Person ID:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Person Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Person Age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Person Address:");
        String address = scanner.nextLine();

        boolean result = repoclass.addPerson(id, name, age, address);

        if (result) {
            System.out.println("Person added successfully");
        } else {
            System.out.println("Invalid details or Person already exists");
        }
    }
}
