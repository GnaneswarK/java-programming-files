import java.util.*;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        sc.close();
        int b;
        if (a > 10 && a < 20) {
            System.out.println("Value of a lies between 10 and 20");
        } else if (a < 10) {
            if (a == 10) {
                System.out.println("Value of a is equal to " + a);
            }
            System.out.println("Value of a is less than 10");
        } else {
            if (a == 20) {
                System.out.println("Value of a is equal to " + a);
            }
            System.out.println("Value of a is grather than 20");
        }

        b = (a == 20) ? 31 : 45;
        System.out.println("value of b is " + b);
    }
}