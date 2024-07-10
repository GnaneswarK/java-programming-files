import java.util.*;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j <= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j = n - 1; j >= 0; j--) {
                if (j <= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j = n - 1; j >= 0; j--) {
                if (j <= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}