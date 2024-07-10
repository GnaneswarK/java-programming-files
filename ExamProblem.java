import java.util.*;

class ExamProblem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ar[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        int arr[] = new int[m];
        int ar1[] = new int[n];
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum = sum + ar[j][i];
            }
            arr[i] = sum / 3;
        }
        int temp = arr[0], k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < temp) {
                k = i;
            }
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                if (j != k)
                    sum = sum + ar[i][j];
            }
            ar1[i] = sum;
        }
        for (int i = 0; i < ar1.length; i++) {
            System.out.print(ar1[i] + " ");
        }
        sc.close();
    }
}