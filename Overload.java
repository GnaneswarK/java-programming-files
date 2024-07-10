import java.util.*;

public class Overload {
    public static void main(Integer[] args) {
        System.out.println("Overload main method with integer args");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Overload main method with String args");
        sc.close();
    }

    public static void main(char[] args) {
        System.out.println("Overload main method with char args");
    }

}