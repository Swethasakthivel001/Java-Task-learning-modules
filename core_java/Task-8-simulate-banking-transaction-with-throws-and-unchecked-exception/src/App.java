import java.util.InputMismatchException;
import java.util.Scanner;
 
public class App {
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        BankAccount account = new BankAccount(5000);
 
        try {
            System.out.println("Current balance: " + account.getBalance());
 
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
 
            account.withdraw(amount);
 
        } catch (IllegalArgumentException e) {
            System.out.println("Transaction failed: " + e.getMessage());
 
        } catch (InputMismatchException e) {
            // Handles non-numeric input.
            System.out.println("Invalid input. Please enter a numeric amount.");
 
        } finally {
            System.out.println("Transaction process completed.");
            scanner.close();
        }
    }
}