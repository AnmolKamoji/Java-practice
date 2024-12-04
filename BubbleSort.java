public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 7;
        arr[1] = 3;
        arr[2] = 1;
        arr[3] = 8;
        arr[4] = 5;
        int arr2[] = { 2, 4, 5, 1, 8 };

        for (int i = 0; i < arr2.length - 1; i++) {
            for (int j = 0; j < arr2.length - i - 1; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.err.print(arr2[i] + " ");
        }
    }
}
