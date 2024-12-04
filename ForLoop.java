public class ForLoop {
    public static void main(String[] args) {
        // to print prime nos from 1 to 100
        int fact = 0;
        for (int i = 2; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    fact = fact + 1;
                }
            }
            if (fact == 2) {
                System.out.println(i);
            }
        }
    }
}
