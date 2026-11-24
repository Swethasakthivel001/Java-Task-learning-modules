

public class StringCompressor {

    private final String input;

    public StringCompressor(String input) {
        this.input = input;
    }

    public String compress() {

        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        int i = 0;

        while (i < input.length()) {

            int currentChar = input.codePointAt(i);

            int count = 0;

            while (i < input.length()
                    && input.codePointAt(i) == currentChar) {

                count++;

                i += Character.charCount(currentChar);
            }

            result.appendCodePoint(currentChar);
            result.append(count);
        }

        return result.toString();
    }
}
