import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int temp = 0, k = 0, x = 0, sum = 0, y = n, xy = 0;
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        while (xy != 1) {
            if (y > 2) {
                temp = arr[0];
                for (int i = 0; i < n; i++) {
                    if (temp > arr[i] && temp != arr[i]) {
                        temp = arr[i];
                        k = i + 1;
                        // System.out.println(k+" k");
                    }
                }
                // System.out.println(k+" k");
                temp = arr[k];
                for (int i = k; i < n; i++) {

                    if (temp > arr[i]) {
                        temp = arr[i];
                        x = i;
                        y = n - x - 1;
                    }
                }
                System.out.println(x + " x" + " " + y + " y");
                temp = arr[k];
                for (int i = k; i < x; i++) {

                    if (temp < arr[i]) {
                        temp = arr[i];
                    }
                }
                // System.out.println(temp);
                sum = sum + temp - arr[k - 1];
                // System.out.println(sum);
            } else if (y <= 2) {
                if (arr[n - 2] > arr[n - 1])
                    sum = sum + arr[n - 2] - arr[x];
                else
                    sum = sum + arr[n - 1] - arr[x];
                xy = 1;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}