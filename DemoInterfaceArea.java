import java.util.*;

interface Area {
    double area(int l, int b);
}

class Rectangle implements Area {
    @Override
    public double area(int l, int b) {
        return l * b;
    }
}

class Triangle implements Area {
    @Override
    public double area(int b, int h) {
        return 0.5 * b * h;
    }
}

public class DemoInterfaceArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int length = sc.nextInt();
        System.out.println("Enter breadth");
        int breadth = sc.nextInt();
        System.out.println("Enter height");
        int height = sc.nextInt();
        Area rectangle = new Rectangle();
        Area traingle = new Triangle();
        System.out.println("Area of an Rectangle " + rectangle.area(length, breadth));
        System.out.println("Area of an Traingle " + traingle.area(length, height));
        sc.close();
    }
}