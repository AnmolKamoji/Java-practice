import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int p = 0;
		int q = 0;
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			count = 0;
			for (int j = 0; j < col; j++) {
				if (arr[i][j] % 2 != 0) {
					count = count + 1;
				}
			}
			if (p > count) {
				p = count;
			}
		}
		if (count == 0) {
			System.out.println("-1");
		} else {
			System.out.println(count);
		}
	}
}
