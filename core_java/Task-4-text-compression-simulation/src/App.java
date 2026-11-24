
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a string: ");

            String input = scanner.nextLine();

            StringCompressor compressor =
                    new StringCompressor(input);

            String compressed = compressor.compress();

            System.out.println("Original String: " + input);

            System.out.println("Compressed String: " + compressed);
        }
    }
}
