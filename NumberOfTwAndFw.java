import java.util.*;

public class NumberOfTwAndFw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int w = sc.nextInt();
        if (w >= 2 && w % 2 == 0 && v < w) {
            int fw = w / 2 - v;
            int tw = v - fw;
            System.out.println("Two wheller vehicles are " + tw + " four wheller vehicles are " + fw);
        } else
            System.out.println("Invalid");
        sc.close();
    }
}