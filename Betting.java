import java.util.*;

public class Betting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("only winning or lossing represention with (w,l)");
        String wOrL = sc.next();
        int initial = 10;
        System.out.println("Enter the betting amount");
        int bet = sc.nextInt();
        char arr[] = wOrL.toLowerCase().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'w' && i == 0 && initial > bet) {
                initial = initial + bet;
            } else if (arr[i] == 'l' && initial > bet) {
                initial = initial - bet;
            } else if (arr[i] == 'w' && initial > bet) {
                initial = initial + bet * 2;
            }
            if (initial < bet)
                break;
        }
        if (initial > bet) {
            System.out.println(initial);
        } else
            System.out.println(-1);
        sc.close();
    }
}