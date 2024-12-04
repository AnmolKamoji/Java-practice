import java.net.SocketPermission;
import java.util.*;

class Functions {
    public static int Factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1 number ");
        int a = sc.nextInt();
        int fact = Factorial(a);
        System.out.println(fact);

    }
}
