import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name/Number ");
        String name = sc.next();
        int temp = 0;
        int length = name.length() - 1;
        for (int i = 0; i <= length; i++) {
            if (name.charAt(i) == name.charAt(length)) {
                temp = temp + 1;
            }
            length = length - 1;
        }
        if (name.length() % 2 == 0) {
            if (temp == name.length() / 2) {
                System.out.println("given name/Number is palindrome");
            } else {
                System.out.println("given name/Number is not a palindrome");
            }
        } else if (name.length() % 2 == 1) {
            if (temp == name.length() / 2 + 1) {
                System.out.println("given name/Number is a palindrome");
            } else {
                System.out.println("given name/Number is not a palindrome");
            }
        }
        sc.close();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////

/*
 * import java.util.*;
 * public class Palindrome{
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter a number/name");
 * String str = sc.next();
 * String str1 = "";
 * for(int i=str.length()-1;i>=0;i--)
 * str1= str1+str.charAt(i);
 * if(str.equals(str1))
 * System.out.println("Given name/number is a palindrome");
 * else
 * System.out.println("Given name/number is not a palindrome");
 * sc.close();
 * }
 * 
 * }
 */

///////////////////////////////////////////////////////////////////////////

/*
 * import java.util.*;
 * public class Palindrome{
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the name/number");
 * StringBuffer buffer = new StringBuffer(sc.next());
 * String str = buffer.toString();
 * if(str.equals(buffer.reverse().toString()))
 * {
 * System.out.println("Given name/number is a palindrome");
 * }
 * else
 * {
 * System.out.println("Given name/number is not a palindrome");
 * }
 * // System.out.println(str.equals(buffer.reverse().toString())?
 * "Palindrome":"Not a Palindrome");
 * sc.close();
 * }
 * }
 */

///////////////////////////////////////////////////////////////////////////

/*
 * import java.util.*;
 * public class Palindrome{
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter a name/Number ");
 * String name = sc.next();
 * int temp=0;
 * int length = name.length()-1;
 * for(int i=0;i<=length;i++)
 * {
 * if(i==length)
 * break;
 * if(name.charAt(i)==name.charAt(length))
 * {
 * temp= temp+1;
 * }
 * length = length-1;
 * }
 * System.out.println(temp);
 * if(temp==name.length()/2)
 * {
 * System.out.println("given name/Number is palindrome");
 * }else
 * {
 * System.out.println("given name/Number is not a palindrome");
 * }
 * sc.close();
 * }
 * }
 */

////////////////////////////////////////////////////////////////////////////////

/*
 * import java.util.*;
 * public class Palindrome{
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter a name/number");
 * String name1 = sc.nextLine();
 * String temp ="";
 * for(int i=name1.length()-1;i>=0;i--)
 * temp = temp+name1.charAt(i);
 * System.out.println(temp.equals(name1)?"Palindrome":"Not a Palindrome");
 * sc.close();
 * }
 * }
 */

///////////////////////////////////////////////////////////////////////////////

/*
 * import java.util.*;
 * class Palindrome
 * {
 * public static void main(String args[])
 * {
 * Scanner sc = new Scanner(System.in);
 * String str2 = sc.next();
 * int temp1=0;
 * for(int i=0;i<str2.length()/2;i++){
 * if(str2.charAt(i)==str2.charAt(str2.length()-i-1))
 * temp1=temp1+1;
 * }
 * System.out.println(temp1==str2.length()/2?"Palindrome":"Not a palindrome");
 * sc.close();
 * }
 * }
 */