
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.println("Animal Kingdom");
        System.out.println("1. Cat");
        System.out.println("2. Dog");
        System.out.print("Enter a number to know the animal sound: ");

        try {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    animal = new Cat();
                    animal.sound();
                    break;

                case 2:
                    animal = new Dog();
                    animal.sound();
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
        catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
        }

        scanner.close();
    }
}
