import java.util.*;

public class StringIntAndCharMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                str1 = str1 + str.charAt(i);
            else
                str1 = str1 + " ";
        }
        str1.trim();
        for (int i = 0; i < str1.length(); i++)
            str1 = str1.replaceAll("  ", " ");
        int length = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ' ')
                length++;
        }
        int count = 0;
        int arr[] = new int[length];
        String temp = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != ' ') {
                temp = temp + str1.charAt(i);
            } else if (str1.charAt(i) == ' ') {
                arr[count] = Integer.parseInt(temp);
                temp = "";
                count++;
            }
        }
        Arrays.sort(arr);
        System.out.println("Minimum number " + arr[0]);
        sc.close();
    }
}