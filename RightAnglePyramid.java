import java.util.*;

public class RightAnglePyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum1 = 1, sum2 = 0;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == 0)
					System.out.print(1 + " ");
				else if (i % 2 == 1) {
					sum2 = sum2 + 2;
					System.out.print(sum2 + " ");
				} else if (i % 2 == 0) {
					sum1 = sum1 + 2;
					System.out.print(sum1 + " ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}