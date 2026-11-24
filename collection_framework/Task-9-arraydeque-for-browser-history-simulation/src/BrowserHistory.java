
import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> backHistory;
    private Deque<String> forwardHistory;

    private String currentPage;

    public BrowserHistory() {
        backHistory = new ArrayDeque<>();
        forwardHistory = new ArrayDeque<>();
        currentPage = null;
    }

    public void visitPage(String url) {

        if (url == null || url.trim().isEmpty()) {
            System.out.println("Invalid webpage URL.");
            return;
        }

        if (currentPage != null) {
            backHistory.push(currentPage);
        }

        currentPage = url.trim();

        forwardHistory.clear();

        System.out.println("Visited: " + currentPage);
    }

    public void goBack() {

        if (backHistory.isEmpty()) {
            System.out.println("No previous page available.");
            return;
        }

        forwardHistory.push(currentPage);

        currentPage = backHistory.pop();

        System.out.println("Navigated back to: " + currentPage);
    }

    public void goForward() {

        if (forwardHistory.isEmpty()) {
            System.out.println("No forward page available.");
            return;
        }

        backHistory.push(currentPage);

        currentPage = forwardHistory.pop();

        System.out.println("Navigated forward to: " + currentPage);
    }

    public void displayCurrentPage() {

        if (currentPage == null) {
            System.out.println("No webpage currently open.");
        } else {
            System.out.println("Current webpage: " + currentPage);
        }
    }

    public void displayHistory() {

        System.out.println("\n--- Browser History ---");

        if (currentPage == null) {
            System.out.println("No browsing history available.");
            return;
        }

        System.out.println("Back History: " + backHistory);
        System.out.println("Current Page: " + currentPage);
        System.out.println("Forward History: " + forwardHistory);
    }
}