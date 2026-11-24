
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            try {
                System.out.print("Enter the first integer: ");
                int numerator = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter the second integer: ");
                int denominator = Integer.parseInt(scanner.nextLine());

                DivisionCalculator calculator =
                        new DivisionCalculator(numerator, denominator);

                int result = calculator.divide();

                System.out.println("Division Result: " + result);

            } catch (ArithmeticException e) {

                System.out.println("Error: Cannot divide by zero.");

            } catch (NumberFormatException e) {

                System.out.println("Error: Please enter valid integers.");

            } finally {

                System.out.println("Program execution has ended.");
            }
        }
    }
}
