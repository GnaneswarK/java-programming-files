import java.util.*;

public class Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int h = sc.nextInt();
        sc.close();
        int arr[] = new int[h - l + 1];
        int count = 0;
        for (int i = 0; i <= h - l; i++) {
            arr[i] = l + i;
        }
        for (int i = 0; i <= h - l; i++) {
            if (arr[i] < 100) {
                if (arr[i] % 10 != arr[i] / 10) {
                    count = count + 1;
                }
            }
            if (arr[i] > 100 && arr[i] < 1000) {
                int k = arr[i] / 10;
                if ((arr[i] % 10 != k % 10) && (k % 10 != k / 10) && (arr[i] % 10 != k / 10)) {
                    System.out.print(arr[i] + " ");
                    count = count + 1;
                }
            }
        }
        System.out.println("\n" + count);
    }
}