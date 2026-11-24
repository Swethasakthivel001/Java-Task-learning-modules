import java.util.Map;
import java.util.TreeMap;

public class StudentManager {

    private Map<Integer, String> students;

    public StudentManager() {
        students = new TreeMap<>();
    }

    public void addStudent(int id, String name) {

        if (id <= 0 || name == null || name.trim().isEmpty()) {
            System.out.println("Invalid student details.");
            return;
        }

        if (students.containsKey(id)) {
            System.out.println("Student ID already exists. Updating name.");
        } else {
            System.out.println("Student added successfully.");
        }

        students.put(id, name.trim());
    }

    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        System.out.println("\n--- Student Records (Sorted by ID) ---");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {

            System.out.println(
                    "Student ID: " + entry.getKey()
                    + " | Student Name: " + entry.getValue()
            );
        }
    }

    public void searchStudent(int id) {

        if (students.containsKey(id)) {
            System.out.println(
                    "Student Name: " + students.get(id)
            );
        } else {
            System.out.println("Student not found.");
        }
    }

    public int getStudentCount() {
        return students.size();
    }
}