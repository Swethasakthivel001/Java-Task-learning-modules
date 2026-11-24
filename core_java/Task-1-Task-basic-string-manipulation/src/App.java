import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter your full name: ");
            String fullName = scanner.nextLine();

            NameProcessor processor = new NameProcessor();

            try {
                Name name = processor.parseFullName(fullName);

                System.out.println("Formatted Name:");
                System.out.println("First Name = " + name.getFirstName());
                System.out.println("Last Name = " + name.getLastName());

                demonstrateStringImmutability();

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }
    }

    public static void demonstrateStringImmutability() {

        System.out.println("\nString Immutability Demonstration:");

        String original = "Hello";

        String concatenated = original.concat(" World");

        System.out.println("Original String = " + original);
        System.out.println("After Concatenation = " + concatenated);

        System.out.println("Are both references pointing to the same object? "
                + (original == concatenated));
    }
}