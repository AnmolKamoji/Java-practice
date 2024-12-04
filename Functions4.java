import java.util.*;

public class Functions4 {
    public static int Prime(int n) {
        int prime = 0;
        for (int i = 2; i <= n; i++) {
            prime = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    prime = prime + 1;
                }
            }
            if (prime == 1) {
                System.out.print(i + ",");
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Functions4 obj = new Functions4();
        obj.Prime(n);
    }
}
