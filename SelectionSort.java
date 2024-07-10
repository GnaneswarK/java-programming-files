import java.util.*;

class SelectionSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int temp = arr[i];
            int index = i;
            for (int j = i; j < n; j++) {
                if (temp >= arr[j]) {
                    temp = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        sc.close();
    }
}

/////////////////////////////////////////////////////

/*
 * import java.util.*;
 * class SelectionSort
 * {
 * public static void main(String args[])
 * {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * for(int i=0;i<arr.length;i++)
 * arr[i] = sc.nextInt();
 * for(int i=0;i<n-1;i++){
 * int smallest=i;
 * for(int j=i+1;j<n;j++){
 * if(arr[smallest]>arr[j]){
 * smallest =j;
 * }
 * }
 * int temp = arr[i];
 * arr[i] = arr[smallest];
 * arr[smallest] = temp;
 * }
 * for(int i=0;i<arr.length;i++)
 * System.out.print(arr[i]+" ");
 * sc.close();
 * }
 * }
 */