import java.util.*;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= 10; i++) {
            int k = i * n;
            System.out.println(n + " * " + i + " = " + k);
        }
    }
}