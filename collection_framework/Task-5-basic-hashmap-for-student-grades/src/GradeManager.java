
import java.util.HashMap;
import java.util.Map;

public class GradeManager {

    private Map<String, String> studentGrades;

    public GradeManager() {
        studentGrades = new HashMap<>();
    }

    public void addStudent(String name, String grade) {

        if (name == null || name.trim().isEmpty()
                || grade == null || grade.trim().isEmpty()) {
            System.out.println("Student name and grade cannot be empty.");
            return;
        }

        if (studentGrades.containsKey(name)) {
            System.out.println("Student already exists. Updating grade.");
        } else {
            System.out.println("Student added successfully.");
        }

        studentGrades.put(name, grade);
    }

    public void displayAllStudents() {

        if (studentGrades.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        System.out.println("\n--- Student Grades ---");

        for (Map.Entry<String, String> entry : studentGrades.entrySet()) {

            System.out.println(
                    "Student Name: " + entry.getKey()
                    + " | Grade: " + entry.getValue()
            );
        }
    }

    public void getGrade(String name) {

        if (studentGrades.containsKey(name)) {
            System.out.println(
                    "Grade of " + name + ": " + studentGrades.get(name)
            );
        } else {
            System.out.println("Student not found.");
        }
    }

    public int getStudentCount() {
        return studentGrades.size();
    }
}