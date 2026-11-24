public class Task implements Comparable<Task> {

    private String taskName;
    private int priority;

    public Task(String taskName, int priority) {
        this.taskName = taskName;
        this.priority = priority;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Task: " + taskName + ", Priority: " + priority;
    }
}
