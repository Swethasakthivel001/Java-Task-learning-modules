import java.util.PriorityQueue;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        System.out.print("Enter number of tasks: ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {

            System.out.println("\nEnter details for Task " + (i + 1));

            System.out.print("Enter task name: ");
            String name = sc.nextLine();

            System.out.print("Enter priority (1 = High, 2 = Medium, 3 = Low): ");
            int priority = sc.nextInt();
            sc.nextLine();

            if (priority < 1 || priority > 3) {
                System.out.println("Invalid priority! Please enter 1, 2, or 3.");
                i--;
                continue;
            }

            taskQueue.offer(new Task(name, priority));
        }

        System.out.println("\nProcessing tasks according to priority:");

        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Processing: " + task);
        }

        sc.close();
    }
}
