import java.io.File;
import java.io.IOException;
@SuppressWarnings("ALL")
public class FileHandling {
    public static void main(String[] args) {
        // code to create a new file
        File myFile = new File("C:\\coding\\java-practice\\Java-practice\\newFile.txt");
        try {
            myFile.createNewFile();
        } catch (IOException ex) {
            System.out.println("Unable to create this file");
            ex.printStackTrace();
        }
    }
}