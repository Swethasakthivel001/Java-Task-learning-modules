import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GradeManager manager = new GradeManager();

        int choice;

        do {
            System.out.println("===== STUDENT GRADE MANAGEMENT =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student Grade");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine().trim();

                    System.out.print("Enter student grade: ");
                    String grade = sc.nextLine().trim();

                    manager.addStudent(name, grade);
                    break;

                case 2:
                    manager.displayAllStudents();
                    break;

                case 3:
                    System.out.print("Enter student name to search: ");
                    String searchName = sc.nextLine().trim();

                    manager.getGrade(searchName);
                    break;

                case 4:
                    System.out.println("Exiting application.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}