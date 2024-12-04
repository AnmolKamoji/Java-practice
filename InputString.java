import java.util.*;

public class InputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a First name");
        String FirstName = sc.nextLine();
        System.err.println("Enter a Last name");
        String LastName = sc.nextLine();
        String FullName = FirstName + " " + LastName;
        System.err.println(FullName.length());

        for (int i = 0; i < FullName.length(); i++) {
            System.err.println(FullName.charAt(i));
        }
    }
}
