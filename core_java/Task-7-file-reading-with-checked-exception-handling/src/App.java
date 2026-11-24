import java.util.Scanner;
 
public class App {
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();
 
        FileReaderService fileReader = new FileReaderService();
        fileReader.readFile(filePath);
 
        scanner.close();
    }
}