import java.util.*;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toString(n);
        char c[] = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum = sum + c[i] - '0';
        }
        System.out.println(n % sum == 0 ? "Harshad Number" : "Not a Harshad Number");
        sc.close();
    }
}