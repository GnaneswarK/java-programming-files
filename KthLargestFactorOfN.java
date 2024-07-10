import java.util.*;

public class KthLargestFactorOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            factors.add(i);
        }
        if (factors.size() > k)
            System.out.println(factors.get(factors.size() - k));
        else
            System.out.println("1");
        sc.close();
    }
}