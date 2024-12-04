public class recursion_factorials {
    public static int calcFactorial(int i) {
        if (i == 1 || i == 0) {
            return 1;
        }
        int fact = calcFactorial(i - 1);
        fact = fact * i;
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(calcFactorial(3));
    }
}
