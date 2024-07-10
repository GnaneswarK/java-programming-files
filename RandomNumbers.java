public class RandomNumbers {
    public static void main(String[] args) {
        int min = 1;
        int max = 6;
        for (int i = 0; i < 5; i++) {
            int random1 = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(random1);
        }
    }
}

/*
 * import java.util.*;
 * public class RandomNumbers{
 * public static void main(String[] args) {
 * Random random = new Random();
 * for(int i=0;i<5;i++){
 * int a = random.nextInt(06);
 * System.out.println(a);
 * }
 * }
 * }
 */