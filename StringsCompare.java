import java.util.*;

public class StringsCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the first name");
        String name1 = sc.nextLine();
        System.err.println("Enter the second name");
        String name2 = sc.nextLine();

        if (name1.compareTo(name2) == 0) {
            System.err.println("The given strings are equal");
        } else {
            System.err.println("Not equal");
        }
    }
}
