import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        int marks[] = { 97, 98, 95 };
        // int[] marks = new int[3];
        // marks[0] = 97; // phy
        // marks[1] = 98; // chem
        // marks[2] = 99; // meth
        System.err.println("the marks are " + marks[0]);

        for (int i = 0; i <= 3; i++) {
            System.err.println(marks[i]);
        }
    }
}