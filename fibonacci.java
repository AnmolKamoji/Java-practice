import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = sc.nextInt();
        int sum = 0;
        System.out.print("0 " + "1 ");
        for (int i = 2; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }

    }
}
