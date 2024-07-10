import java.util.*;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                str1 = str1 + str.substring(i, i + 1).toUpperCase();
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                str1 = str1 + str.substring(i, i + 1).toLowerCase();
            } else {
                str1 = str1 + str.substring(i, i + 1);
            }
        }
        System.out.println(str1);
        sc.close();
    }
}