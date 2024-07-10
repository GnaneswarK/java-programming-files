import java.util.*;

public class NumberOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String str = sc.next().toLowerCase();
        int length = (str.length()) * (str.length() + 1) / 2;
        String arr[] = new String[length];
        int temp = 0;
        for (int i = 0; i < str.length(); i++) {
            String temp1 = "";
            for (int j = i; j < str.length(); j++) {
                temp1 = temp1 + str.charAt(j);
                arr[temp] = temp1;
                temp++;
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp2 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp2;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}