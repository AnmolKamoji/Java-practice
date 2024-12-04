import java.util.*;

public class NumberReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number ");
        int num = sc.nextInt();
        int length = String.valueOf(num).length();
        int Reverse = 0;
        if (num >= 0) {
            for (int i = 0; i < length; i++) {
                int num2 = num % 10;
                Reverse = Reverse * 10 + num2;
                num = num / 10;
            }
        } else if (num < 0) {
            for (int i = 0; i < length; i++) {
                int num2 = num % 10;
                Reverse = Reverse * 10 + num2;
                num = num / 10;
            }
            Reverse = Reverse / 10;
        } else {
            System.out.println("0");
        }
        System.out.println(Reverse);
    }
}
