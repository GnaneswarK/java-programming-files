import java.util.*;

public class Series1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 2, y = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int sum = x * y;
                System.out.print(sum + " ");
                x = x + 2;
                y = y + 4;
            }
            System.out.println("");
        }
        sc.close();
    }
}