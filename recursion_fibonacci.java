public class recursion_fibonacci {
    public static int calcFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int fibo = calcFibonacci(i - 1);
        fact = fact * i;
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(calcFactorial(3));
    }
}
