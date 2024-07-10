import java.util.*;

public class FillingATank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a tank");
        int radius = sc.nextInt();
        System.out.println("Enter the height of a tank");
        int height = sc.nextInt();
        System.out.println("Enter the water flow in volume per minute");
        int flowTime = sc.nextInt();
        double volume = 2 * 3.14 * radius * height * radius;
        double fillTheTank = volume / flowTime;
        System.out.println("Expected Time");
        double expectedTime = sc.nextDouble();
        System.out.println("the volume of a tank is " + volume);
        System.out.println("Time taken to fill the tank is " + fillTheTank);
        if (expectedTime < fillTheTank) {
            System.out.println("Under Flow");
        } else {
            System.out.println("Over Flow");
        }
        sc.close();
    }
}