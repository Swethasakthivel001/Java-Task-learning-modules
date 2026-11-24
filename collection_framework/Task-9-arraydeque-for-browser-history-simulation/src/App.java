
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BrowserHistory browser = new BrowserHistory();

        int choice;

        do {
            System.out.println("===== BROWSER HISTORY =====");
            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Display Current Page");
            System.out.println("5. Display Browser History");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter webpage URL: ");
                    String url = sc.nextLine();

                    browser.visitPage(url);
                    break;

                case 2:
                    browser.goBack();
                    break;

                case 3:
                    browser.goForward();
                    break;

                case 4:
                    browser.displayCurrentPage();
                    break;

                case 5:
                    browser.displayHistory();
                    break;

                case 6:
                    System.out.println("Closing browser history application.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}