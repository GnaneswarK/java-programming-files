import java.util.*;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        char arr[] = password.toCharArray();
        int temp = 0;
        if (arr.length >= 8) {
            for (int i = 0; i < arr.length; i++) {
                if (Character.isLetter(arr[i]))
                    temp++;
                else if (Character.isDigit(arr[i]))
                    temp++;
                else
                    break;
            }
            System.out.println(temp);
            if (temp == arr.length)
                System.out.println("Password accepted!");
            else
                System.err.println("Password must contain only letter and digits");
        } else
            System.out.println("Password must be greather than 8 letters");
        sc.close();
    }
}