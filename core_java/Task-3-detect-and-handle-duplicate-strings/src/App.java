import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    static class StringWrapper {

        private final String value;

        public StringWrapper(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public int hashCode() {

            if (value == null) {
                return 0;
            }

            return value.hashCode();
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) {
                return true;
            }

            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            StringWrapper other = (StringWrapper) obj;

            if (value == null) {
                return other.value == null;
            }

            return value.equals(other.value);
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the number of strings: ");

            int count;

            try {
                count = Integer.parseInt(scanner.nextLine());

                if (count < 0) {
                    System.out.println("Count cannot be negative.");
                    return;
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                return;
            }

            Map<StringWrapper, Integer> frequency = new LinkedHashMap<>();

            for (int i = 0; i < count; i++) {

                System.out.print("Enter string " + (i + 1) + ": ");

                String input = scanner.nextLine();

                String value = input.equalsIgnoreCase("<null>") ? null : input;

                StringWrapper key = new StringWrapper(value);

                frequency.put(
                        key,
                        frequency.getOrDefault(key, 0) + 1
                );
            }

            System.out.println("Duplicate Strings:");

            boolean found = false;

            for (Map.Entry<StringWrapper, Integer> entry
                    : frequency.entrySet()) {

                if (entry.getValue() > 1) {

                    String value = entry.getKey().getValue();

                    System.out.println(
                            value == null ? "<null>" : value
                    );

                    found = true;
                }
            }

            if (!found) {System.out.println("No duplicates found.");}

            System.out.println("HashCode and Equals Demonstration:");

            StringWrapper first = new StringWrapper("FB");
            StringWrapper second = new StringWrapper("Ea");

            System.out.println("FB hashCode: " + first.hashCode());
            System.out.println("Ea hashCode: " + second.hashCode());

            System.out.println("Same hashCode: " + (first.hashCode() == second.hashCode()));

            System.out.println("Are equal: " + first.equals(second));
        }
    }
}