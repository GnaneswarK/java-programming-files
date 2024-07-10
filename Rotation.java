import java.util.*;

public class Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String1");
        String str1 = sc.next().toLowerCase();
        System.out.println("Enter a String1");
        String str2 = sc.next().toLowerCase();
        if (str1.length() == str2.length()) {
            if ((str1 + str1).contains(str2)) {
                System.out.println("String2 is Rotation of String1");
            } else {
                System.out.println("String2 is not a Rotation of String1");
            }
        } else {
            System.out.println("String2 is not a Rotation of String1");
        }
        sc.close();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////

/*
 * import java.util.*;
 * public class Exercise1 {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter a String1");
 * String str1 = sc.next().toLowerCase();
 * System.out.println("Enter a String1");
 * String str2 = sc.next().toLowerCase();
 * int temp=0;
 * if(str1.length()==str2.length())
 * {
 * for(int i=0;i<str1.length();i++)
 * {
 * if(str1.equals(str2.substring(i)+str2.subSequence(0, i)))
 * temp++;
 * }
 * }
 * if(temp>0)
 * {
 * System.out.println("String2 is Rotation of String1");
 * }else
 * {
 * System.out.println("String2 is not a Rotation of String1");
 * }
 * sc.close();
 * }
 * }
 */