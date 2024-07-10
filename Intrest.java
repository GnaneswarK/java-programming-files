import java.util.*;

public class Intrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = 17000;
        double interst = 0.07;
        double intrestAmount = amount * interst;
        double TotalAmount = amount + intrestAmount;
        System.out.println("Interset amount = " + amount * interst);
        System.out.println("Total amount after one year " + TotalAmount);
        sc.close();
    }
}