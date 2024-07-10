import java.util.*;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            numbers.add(i);
        }
        int k = 2;
        int temp = 0;
        while (numbers.size() > 1) {
            for (int i = 0; i < numbers.size(); i++) {
                if (temp == k - 1) {
                    numbers.remove(i);
                    i = i - 1;
                }
                temp = temp + 1;
                if (temp > k - 1) {
                    temp = 0;
                }
            }
        }
        System.out.println(numbers.get(0));
        sc.close();
    }
}