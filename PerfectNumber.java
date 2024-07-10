import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                factors.add(i);
        }
        int sum = 0;
        for (int i = 0; i < factors.size(); i++)
            sum = sum + factors.get(i);
        System.out.println(n == sum ? "Perfect Number" : "Not a Perfect Number");
        sc.close();
    }
}