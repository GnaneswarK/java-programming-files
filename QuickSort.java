import java.util.*;

public class QuickSort {
    public static void main(String args[]) {
        Random r = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++)
            arr[i] = r.nextInt(50);
        System.out.println("Before Sorting");
        printArrays(arr);
        QuickSortAlgorithm(arr, 0, arr.length - 1);
        System.out.println("\n After Sorting");
        printArrays(arr);
    }

    static void QuickSortAlgorithm(int arr[], int lowerIndex, int higherIndex) {
        if (lowerIndex >= higherIndex)
            return;
        int pivot = higherIndex;
        int left = lowerIndex;
        int right = higherIndex;
        while (left < right) {// 0<6
            while (arr[left] <= arr[pivot] && left < right) {// 1<=7 8<7
                left++;
            }
            while (arr[right] >= arr[pivot] && left < right) {
                right--;
            }
            swap(arr, right, left);
        }
        swap(arr, left, higherIndex);
        QuickSortAlgorithm(arr, lowerIndex, left - 1);
        QuickSortAlgorithm(arr, left + 1, higherIndex);
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArrays(int arr[]) {
        for (int i = 0; i < 10; i++)
            System.out.print(arr[i] + " ");
    }
}