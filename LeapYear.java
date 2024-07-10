import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Year of birth");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println(
                    "1 : january 2 : febuary 3 : march 4 : april 5 : may \n6 : june 7 : july 8 : augest 9 : september 10 : october \n11 : november 12 : december ");
            System.out.println("\nEnter your choice");
            int month = sc.nextInt();
            switch (month) {
                case 1:
                    System.out.println("You will not receive a gift ");
                    break;
                case 2:
                    System.out.println("birth of date");
                    int february = sc.nextInt();
                    System.out
                            .println(february == 29 ? "You will receive a gift" : "Sorry You will not receive a gift");
                    break;
                case 3:
                    System.out.println("You will not receive a gift ");
                    break;
                case 4:
                    System.out.println("You will not receive a gift ");
                    break;
                case 5:
                    System.out.println("You will not receive a gift ");
                    break;
                case 6:
                    System.out.println("You will not receive a gift ");
                    break;
                case 7:
                    System.out.println("You will not receive a gift ");
                    break;
                case 8:
                    System.out.println("You will not receive a gift ");
                    break;
                case 9:
                    System.out.println("You will not receive a gift ");
                    break;
                case 10:
                    System.out.println("You will not receive a gift ");
                    break;
                case 11:
                    System.out.println("You will not receive a gift ");
                    break;
                case 12:
                    System.out.println("You will not receive a gift ");
                    break;
            }
        } else {
            System.out.println("You will not receive a gift ");
        }
        sc.close();
    }
}