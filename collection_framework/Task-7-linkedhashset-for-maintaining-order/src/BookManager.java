
import java.util.LinkedHashSet;
import java.util.Set;

public class BookManager {

    private Set<String> books;
    
    public BookManager() {
        books = new LinkedHashSet<>();
    }

    public void addBook(String title) {

        if (title == null || title.trim().isEmpty()) {
            System.out.println("Book title cannot be empty.");
            return;
        }

        boolean added = books.add(title.trim());

        if (added) {
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Duplicate book! Book already exists.");
        }
    }

    public void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\n--- Book Collection ---");

        int count = 1;

        for (String book : books) {
            System.out.println(count + ". " + book);
            count++;
        }
    }

    public void searchBook(String title) {

        if (books.contains(title.trim())) {
            System.out.println("Book found: " + title);
        } else {
            System.out.println("Book not found.");
        }
    }

    public int getBookCount() {
        return books.size();
    }
}