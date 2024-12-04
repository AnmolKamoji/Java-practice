import java.util.*;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // if else case
        System.err.println("Enter a number");
        int num = sc.nextInt();
        if (num >= 0) {
            System.err.println("Positive number");
        } else {
            System.err.println("Negative number");
        }

        System.err.println("Enter a option 1 2 or 3");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.err.println("Hello");
                break;
            case 2:
                System.err.println("Namaste");
                break;
            case 3:
                System.err.println("Bonjour");
                break;
            default:
                System.err.println("invalid");
        }
    }
}
