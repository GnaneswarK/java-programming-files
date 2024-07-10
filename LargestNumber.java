import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values of n numbers");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }

        System.out.println("The largest number among the n numbers is " + arr[n - 1]);
        sc.close();
    }
}

///////////////////////////////////////////////////////////////////////////////

/*
 * import java.util.*;
 * public class Exercise1 {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the n number");
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * System.out.println("Enter the values of n numbers");
 * for(int i=0;i<n;i++)
 * {
 * arr[i]= sc.nextInt();
 * }
 * int temp = arr[0];
 * for(int i=1;i<n;i++)
 * {
 * if(temp<arr[i]) //
 * temp = arr[i];
 * }
 * System.out.println("The largest number among the n numbers is "+temp);
 * sc.close();
 * }
 * }
 */

//////////////////////////////////////////////////////////////////////////////
/*
 * import java.util.*;
 * public class LargestNumber{
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the n number");
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * System.out.println("Enter the values of n numbers");
 * for(int i=0;i<n;i++)
 * {
 * arr[i]= sc.nextInt();
 * }
 * Arrays.sort(arr);
 * System.out.println("The largest number among the n numbers is "+arr[n-1]);
 * sc.close();
 * }
 * }
 */
