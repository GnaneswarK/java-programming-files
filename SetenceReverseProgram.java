import java.util.*;

public class SetenceReverseProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int temp = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                temp++;
        }
        String a[] = s.split(" ", temp);
        for (int i = 0; i < a.length; i++) {
            String dup = "";
            for (int j = a[i].length() - 1; j >= 0; j--) {
                dup += a[i].charAt(j);
            }
            a[i] = dup;
            // StringBuilder builder = new StringBuilder(a[i]);
            // a[i]=builder.reverse().toString();
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}

/*
 * import java.util.*;
 * public class SetenceReverseProgram{
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * String s = sc.nextLine().trim();
 * int temp=1;
 * for(int i=0;i<s.length();i++){
 * if(s.charAt(i)==' ')
 * temp++;
 * }
 * String a[] = s.split(" ", temp);
 * for(int i=0;i<a.length;i++){
 * StringBuilder builder = new StringBuilder(a[i]);
 * a[i]=builder.reverse().toString();
 * System.out.print(a[i]+" ");
 * }
 * sc.close();
 * }
 * }
 */