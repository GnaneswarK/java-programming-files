import java.util.*;

public class BinarySearchAlgorith {
    public static void BinarySearch(int[] arr, int first, int last, int key) {
        if (first <= last) {
            int middle = (first + last) / 2;
            if (arr[middle] == key) {
                System.out.println("key found at the index of : " + middle);
            } else if (arr[middle] > key) {
                last = middle - 1;
                BinarySearch(arr, first, last, key);
            } else if (arr[middle] < key) {
                first = middle + 1;
                BinarySearch(arr, first, last, key);
            }
        } else
            System.out.println("element is not present in the array");
    }

    public static void main(String[] args) {
        int[] naturalNumbers = { 5, 15, 3, 2, 7, 9, 1, 4, 11 };
        for (int i = naturalNumbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (naturalNumbers[j] > naturalNumbers[j + 1]) {
                    int temp = naturalNumbers[j];
                    naturalNumbers[j] = naturalNumbers[j + 1];
                    naturalNumbers[j + 1] = temp;
                }
            }
        }
        int firstIndex = 0;
        int lastIndex = naturalNumbers.length - 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the search element");
        int key = sc.nextInt();
        if (key > naturalNumbers[naturalNumbers.length - 1] || key < naturalNumbers[0]) {
            System.out.println("element is not present in the array");
        } else {
            BinarySearch(naturalNumbers, firstIndex, lastIndex, key);
        }
        sc.close();
    }
}