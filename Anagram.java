import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String input1 = sc.next();
        System.out.println("Enter a name");
        String input2 = sc.next();
        int temp = 0;
        if (input1.length() == input2.length()) {
            char arr1[] = input1.toLowerCase().toCharArray();
            char arr2[] = input2.toLowerCase().toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for (int i = 0; i < input1.length(); i++) {
                if (arr1[i] == arr2[i])
                    temp = temp + 1;
            }
            if (temp == input1.length())
                System.out.println("Anagram");
            else
                System.out.println("Not an Anagram");
        } else
            System.out.println("Not an Anagram");
        sc.close();
    }
}