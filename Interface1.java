import java.util.*;

interface Interface {
    public float convertDollarsToRupees(float f);

    public float convertPoundsToRupees(float f);

    public float convertDinnarToRupees(float f);
}

class Convert implements Interface {
    @Override
    public float convertDollarsToRupees(float f) {
        return (float) (f * 79.46);
    }

    @Override
    public float convertPoundsToRupees(float f) {
        return (float) (f * 97.03);
    }

    @Override
    public float convertDinnarToRupees(float f) {
        return (float) (f * 259.37);
    }
}

public class Interface1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dollar amount");
        float Dollar = sc.nextInt();
        System.out.println("Enter Pounds amount");
        float Pounds = sc.nextInt();
        System.out.println("Enter Dinnar amount");
        float Dinnar = sc.nextInt();
        Interface i = new Convert();
        System.out.println("Dollar to Rupees " + i.convertDollarsToRupees(Dollar));
        System.out.println("Pounds to Rupees " + i.convertPoundsToRupees(Pounds));
        System.out.println("Dinnar to Rupees " + i.convertDinnarToRupees(Dinnar));
        sc.close();
    }
}