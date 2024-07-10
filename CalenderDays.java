import java.util.*;

public class CalenderDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "1 : january 2 : febuary 3 : march 4 : april 5 : may \n6 : june 7 : july 8 : augest 9 : september 10 : october \n11 : november 12 : december \n Enter Month");
        int n = sc.nextInt();
        if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12)
            System.out.println("Has 31 days");
        else if (n == 4 || n == 6 || n == 9 || n == 11)
            System.out.println("Has 30 days");
        else if (n == 2)
            System.out.println("Has 28 or 29 days");
        else
            System.out.println("Invalid");
        sc.close();
    }
}