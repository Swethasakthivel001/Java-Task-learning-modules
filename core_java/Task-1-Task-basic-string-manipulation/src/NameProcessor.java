public class NameProcessor {

    public Name parseFullName(String fullName) {

        // Check for null input
        if (fullName == null) {
            throw new IllegalArgumentException("Name cannot be null.");
        }

        // Remove leading and trailing spaces
        fullName = fullName.trim();

        // Check for empty input
        if (fullName.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        // Split the name using one or more spaces
        String[] parts = fullName.split("\\s+");

        // Check whether first name and last name are available
        if (parts.length < 2) {
            throw new IllegalArgumentException(
                    "Please enter both first name and last name.");
        }

        // First word is first name
        String firstName = parts[0].toUpperCase();

        // Last word is last name
        String lastName = parts[parts.length - 1].toUpperCase();

        return new Name(firstName, lastName);
    }
}