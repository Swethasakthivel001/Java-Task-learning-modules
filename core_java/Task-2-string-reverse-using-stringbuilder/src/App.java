
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            StringReverser reverser = new StringReverser();
            AddressFormatter formatter = new AddressFormatter();

            try {
                System.out.print("Enter a sentence: ");
                String sentence = scanner.nextLine();

                String reversed = reverser.reverseSentence(sentence);

                System.out.println("Original Sentence: " + sentence);
                System.out.println("Reversed Sentence: " + reversed);

                System.out.println("\nEnter Address Details:");

                System.out.print("Street: ");
                String street = scanner.nextLine();

                System.out.print("City: ");
                String city = scanner.nextLine();

                System.out.print("State: ");
                String state = scanner.nextLine();

                System.out.print("Postal Code: ");
                String postalCode = scanner.nextLine();

                String address = formatter.formatAddress(
                        street, city, state, postalCode);

                System.out.println("\nFormatted Address:");
                System.out.println(address);

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
