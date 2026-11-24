
import java.util.LinkedList;

public class TaskManager {

    private LinkedList<String> tasks;

    public TaskManager() {
        tasks = new LinkedList<>();
    }

    public void addTask(String task) {

        if (task == null || task.trim().isEmpty()) {
            System.out.println("Task cannot be empty.");
            return;
        }

        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    public void displayTasks() {

        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("\n--- To-Do List ---");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void removeTask(int taskNumber) {

        if (taskNumber < 1 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }

        String removedTask = tasks.remove(taskNumber - 1);

        System.out.println("Completed task removed: " + removedTask);
    }

    public int getTaskCount() {
        return tasks.size();
    }
}