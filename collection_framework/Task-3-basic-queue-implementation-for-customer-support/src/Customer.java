public class Customer implements Comparable<Customer> {

    private String name;
    private String issue;
    private int priority;
    private int arrivalOrder;

    public Customer(String name, String issue, int priority, int arrivalOrder) {
        this.name = name;
        this.issue = issue;
        this.priority = priority;
        this.arrivalOrder = arrivalOrder;
    }

    public String getName() {
        return name;
    }

    public String getIssue() {
        return issue;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Customer other) {

        int result = Integer.compare(this.priority, other.priority);

        if (result == 0) {
            return Integer.compare(this.arrivalOrder, other.arrivalOrder);
        }

        return result;
    }

    @Override
    public String toString() {
        return "Customer: " + name
                + " | Issue: " + issue
                + " | Priority: " + priority;
    }
}