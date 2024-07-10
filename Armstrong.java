import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String duplicate = Integer.toString(n);
        int sum = 0;
        char c[] = duplicate.toCharArray();
        for (int j = 0; j < duplicate.length(); j++) {
            int temp = Character.getNumericValue(c[j]);
            temp = (int) Math.pow(temp, duplicate.length());
            sum = sum + temp;
        }
        System.out.println(n == sum ? "Armstrong" : "Not an Armstrong");
        sc.close();
    }
}

///////////////////////////////////////////////////////
/*
 * import java.util.*;
 * public class Armstrong{
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * String duplicate = Integer.toString(n);
 * int sum=0;
 * char c[] = duplicate.toCharArray();
 * for(int i=0;i<duplicate.length();i++){
 * //int k = c[i] -'0';
 * int k = Character.getNumericValue(c[i]);
 * int temp = (int)Math.pow(k, duplicate.length());
 * sum = sum+temp;
 * }
 * System.out.println(n==sum?"Armstrong "+sum:"Not an Armstrong "+sum);
 * sc.close();
 * }
 * }
 */

//////////////////////////////////////////////////////////
/*
 * import java.util.*;
 * class Armstrong
 * {
 * public static void main(String args[])
 * {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * String dup = Integer.toString(n);
 * int sum =0;
 * while(n>0){
 * int k = n%10;
 * sum += (int)Math.pow(k,dup.length() );
 * n= n/10;
 * }
 * System.out.println(sum==n?"Armstrong":"Not a ArmStrong");
 * sc.close();
 * }
 * }
 */