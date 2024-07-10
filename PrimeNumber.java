import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to check it's a prime number or not");
        int n = sc.nextInt();
        int temp = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                temp = temp + 1;
            }
            if (temp >= 1)
                break;
        }
        if (temp == 0 && n > 1) {
            System.out.println("Given number is Prime Number");
        } else if (n == 1) {
            System.out.println("neither a prime nor a composite");
        } else if (n < 1) {
            System.out.println("Invalid prime numbers lies between 1<prime<+Infinity");
        } else {
            System.out.println("Given number is not a Prime Number");
        }
        sc.close();
    }
}