import java.util.*;

class BubbleSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        while (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    arr[i] = arr[i] + arr[i + 1];
                    arr[i + 1] = arr[i] - arr[i + 1];
                    arr[i] = arr[i] - arr[i + 1];
                }
            }
            n = n - 1;
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        sc.close();
    }
}

////////////////////////////////////////////////////////

/*
 * class BubbleSort
 * {
 * public static void main(String args[])
 * {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * for(int i=0;i<arr.length;i++)
 * arr[i] = sc.nextInt();
 * for(int i=0;i<n-1;i++){
 * for(int j=0;j<n-i-1;j++){
 * if(arr[j]>arr[j+1]){
 * arr[j]=arr[j]+arr[j+1];
 * arr[j+1]=arr[j]-arr[j+1];
 * arr[j]=arr[j]-arr[j+1];
 * }
 * }
 * }
 * for(int i=0;i<arr.length;i++)
 * System.out.print(arr[i]+" ");
 * sc.close();
 * }
 * }
 */

///////////////////////////////////////////////////////

/*
 * import java.util.*;
 * class BubbleSort
 * {
 * public static void main(String args[])
 * {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * for(int i=0;i<n;i++)
 * arr[i]=sc.nextInt();
 * for(int i=n-1;i>0;i--){
 * for(int j=0;j<i;j++){
 * if(arr[j]>arr[j+1]){
 * int temp=arr[j];
 * arr[j]=arr[j+1];
 * arr[j+1]=temp;
 * }
 * }
 * }
 * for(int i=0;i<n;i++)
 * System.out.print(arr[i]+" ");
 * sc.close();
 * }
 * }
 */