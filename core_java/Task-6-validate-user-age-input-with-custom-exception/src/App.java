import java.util.InputMismatchException;
import java.util.Scanner;
 
public class App {
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        AgeValidator validator = new AgeValidator();
 
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
 
            validator.validateAge(age);
 
            System.out.println("You are eligible.");
 
        } catch (UnderAgeException exception) {
            
            System.out.println("Underage: " + exception.getMessage());
 
        } catch (InputMismatchException exception) {
            
            System.out.println("Invalid input: Please enter an integer.");
 
        } catch (IllegalArgumentException exception) {
            
            System.out.println("Invalid age: " + exception.getMessage());
 
        } finally {
            
            System.out.println("Age validation completed.");
            scanner.close();
        }
    }
}