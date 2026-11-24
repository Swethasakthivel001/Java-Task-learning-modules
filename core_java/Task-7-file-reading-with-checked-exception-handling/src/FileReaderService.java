import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 
public class FileReaderService {
 
    public void readFile(String filePath) {
 
        FileInputStream inputStream = null;
 
        try {
            inputStream = new FileInputStream(filePath);
 
            int data;
 
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
 
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
 
        } catch (IOException e) {
            System.out.println("Error while reading the file: " + e.getMessage());
 
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                    System.out.println("\nFile stream closed.");
                } catch (IOException e) {
                    System.out.println("Error while closing the file: " + e.getMessage());
                }
            }
        }
    }
}