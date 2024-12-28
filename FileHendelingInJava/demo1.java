import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class demo1 {
    public static void main(String[] args) {
        String text = "This is My Java Program!\nAnd I am affected with this Language.\n";
        Path fileName = Paths.get   ("/Users/HP/OneDrive/Desktop/Programming/Java Practical/FileHendelingInJava/Files");
        try {
            Files.writeString(fileName, text);
            String fileContent = Files.readString(fileName);
            System.out.println(fileContent);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
        } catch (IOException e) {
            System.err.println("Error reading or writing file: " + fileName);
        }
    }
}

