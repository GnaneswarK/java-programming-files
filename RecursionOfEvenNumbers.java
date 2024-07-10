import java.util.*;

public class RecursionOfEvenNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findsum(arr, n));
        sc.close();
    }

    public static int findsum(int arr[], int n) {
        if (n <= 0)
            return 0;
        else if (arr[n - 1] % 2 == 0)
            return arr[n - 1] + findsum(arr, n - 1);
        else
            return findsum(arr, n - 1);
    }
}