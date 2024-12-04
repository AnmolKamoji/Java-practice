public class Prime {
    public static void main(String[] args) {
        // print prime 1 to 100
        int prime = 0;
        for (int i = 2; i <= 100; i++) {
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
    }
}
