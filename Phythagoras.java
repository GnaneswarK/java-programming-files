import java.util.*;

public class Phythagoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            if (a * a == b * b + c * c) {
                System.out.println("Its satisfy phythagoras theorem");
            } else {
                System.out.println("Its will not satisfy phythagoras theorem");
            }
        }
        if (b > a && b > c) {
            if (b * b == a * a + c * c) {
                System.out.println("Its satisfy phythagoras theorem");
            } else {
                System.out.println("Its will not satisfy phythagoras theorem");
            }
        }
        if (c > a && c > b) {
            if (c * c == a * a + b * b) {
                System.out.println("Its satisfy phythagoras theorem");
            } else {
                System.out.println("Its will not satisfy phythagoras theorem");
            }
        }
        sc.close();
    }
}