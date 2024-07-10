import java.util.*;

class AltTab {
    public int[] altTab(int input1, int input2, int[] input3) {
        int ar[] = new int[input1];
        ar[0] = input3[input2 - 1];
        for (int i = 1; i < input1; i++) {
            if (i <= input2 - 1)
                ar[i] = input3[i - 1];
            else if (i > input2 - 1)
                ar[i] = input3[i];
        }
        return ar;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        AltTab userMainCode = new AltTab();
        int ar1[] = userMainCode.altTab(n, k, arr);
        for (int i = 0; i < n; i++)
            System.out.print(ar1[i] + " ");
        sc.close();
    }
}