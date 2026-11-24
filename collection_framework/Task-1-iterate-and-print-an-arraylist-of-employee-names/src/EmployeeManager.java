
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeManager {

    private final List<String> employeeNames;

    public EmployeeManager() {
        employeeNames = new ArrayList<>();
    }

    public void addEmployee(String name) {
        employeeNames.add(name);
    }

    public void displayUsingIterator() {

        System.out.println("Employees using Iterator:");

        Iterator<String> iterator = employeeNames.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }

    public void displayUsingForEach() {

        System.out.println("Employees using For-Each Loop:");

        for (String name : employeeNames) {
            System.out.println(name);
        }
    }
}
