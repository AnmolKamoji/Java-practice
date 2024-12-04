import java.util.*;

public class TryAndCatch {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("The result is " + c);
        } catch (Exception e) {
            System.out.println("0");
            System.out.println(e);
        }
    }
}
