public class WeightCounter {
    public static void main(String[] args) {
        int[] weights = { 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int targetWeight = 450;
        int count = 0;

        for (int i = 0; i < weights.length; i++) {
            while (targetWeight >= weights[i]) {
                targetWeight -= weights[i];
                count++;
            }
        }

        System.out.println("Total number of weights required to reach " + targetWeight + " is: " + count);
    }
}
