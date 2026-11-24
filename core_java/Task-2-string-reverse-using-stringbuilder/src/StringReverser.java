
public class StringReverser {

    public String reverseSentence(String sentence) {

        if (sentence == null) {
            throw new IllegalArgumentException("Sentence cannot be null.");
        }

        sentence = sentence.trim();

        if (sentence.isEmpty()) {
            throw new IllegalArgumentException("Sentence cannot be empty.");
        }

        StringBuilder builder = new StringBuilder(sentence);

        return builder.reverse().toString();
    }
}
