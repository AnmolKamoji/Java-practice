import java.util.*;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the size of the array ");
        int i = sc.nextInt();
        int marks[] = new int[i];
        for (int j = 0; j < i; j++) {
            marks[j] = sc.nextInt();
        }
        for (int j = 0; j < i; j++) {
            System.err.println(marks[j]);
        }
    }
}
// The problem i incurred in this program is that the array index was larger
// than the actual size of the array
//
