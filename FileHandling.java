import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class FileHandling {
    public static void main(String[] args) {
        // code to create a new file
//        File myFile = new File("C:\\coding\\java-practice\\Java-practice\\newFile.txt");
//        try {
//            myFile.createNewFile();
//        } catch (IOException ex) {
//            System.out.println("Unable to create this file");
//            ex.printStackTrace();
//        }

        // Code to write to a file
//      try {
//        FileWriter fileWriter = new FileWriter("newFile.txt");
//          fileWriter.write("This is our first file from this java course");
//          fileWriter.close();
//      } catch (IOException e) {
//        throw new RuntimeException(e);
//      }

      //Reading a file
        File myFile = new File("newFile.txt");
      try {
        Scanner sc = new Scanner(myFile);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
      } catch (FileNotFoundException e) {
            e.printStackTrace();
      }

    }
}