import java.util.*;

public class Functions3 {

    public static int Product(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The product is " + Product(a, b));
    }
}
