import java.util.*;

public class Caluculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 0;
        do {
            System.out.println(
                    " 1 : Addition\n 2 : Subtraction\n 3 : division\n 4 : Multiplication\n 5 : Modulus\n 6 : exit");
            int choice = sc.nextInt();
            if (choice >= 7) {
                x = 1;
                System.out.println("Invalid");
            }
            switch (choice) {
                case 1:

                    System.out.println(a + b + " result\n ****************");
                    break;
                case 2:
                    System.out.println(a - b + " result\n ****************");
                    break;
                case 3:
                    System.out.println(a / b + " result\n ****************");
                    break;
                case 4:
                    System.out.println(a * b + " result\n ****************");
                    break;
                case 5:
                    System.out.println(a % b + " result\n ****************");
                    break;
                case 6:
                    x = 1;
                    break;
            }
        } while (x == 0);
        sc.close();
    }
}