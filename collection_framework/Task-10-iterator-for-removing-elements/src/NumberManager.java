
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumberManager {

    private final List<Integer> numbers;

    public NumberManager() {
        numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void removeEvenNumbers() {

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {

            int number = iterator.next();

            if (number % 2 == 0) {
                iterator.remove();
            }
        }
    }

    public void displayNumbers() {

        if (numbers.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        System.out.println("Final list: " + numbers);
    }
}
