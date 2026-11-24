import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TaskManager manager = new TaskManager();

        int choice;

        do {
            System.out.println("===== TO-DO LIST APPLICATION =====");
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Remove Completed Task");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter task name: ");
                    String task = sc.nextLine();

                    manager.addTask(task);
                    break;

                case 2:
                    manager.displayTasks();
                    break;

                case 3:
                    manager.displayTasks();

                    if (manager.getTaskCount() > 0) {

                        System.out.print("Enter completed task number: ");
                        int taskNumber = sc.nextInt();
                        sc.nextLine();

                        manager.removeTask(taskNumber);
                    }
                    break;

                case 4:
                    System.out.println("Exiting To-Do List Application.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}