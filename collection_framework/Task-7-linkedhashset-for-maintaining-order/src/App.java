
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BookManager manager = new BookManager();

        int choice;

        do {
            System.out.println("\n===== BOOK MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();

                    manager.addBook(title);
                    break;

                case 2:
                    manager.displayBooks();
                    break;

                case 3:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = sc.nextLine().trim();

                    manager.searchBook(searchTitle);
                    break;

                case 4:
                    System.out.println("Exiting application.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}