import java.util.*;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minRange = sc.nextInt();
        int maxRange = sc.nextInt();
        int arr[] = new int[maxRange - minRange + 1];
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
            arr[i] = i + minRange;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 1; j < maxRange; j++) {
                if (arr[i] % j == 0 && arr[i] > j)
                    temp++;
            }
            if (temp == 1)
                primeNumbers.add(arr[i]);
        }
        System.out.println(primeNumbers);
        sc.close();
    }
}

///////////////////////////////////////////////////////////

/*
 * import java.util.*;
 * public class Exercise1{
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int minRange = sc.nextInt();
 * int maxRange = sc.nextInt();
 * ArrayList<Integer> primeNumbers = new ArrayList<>();
 * for(int i= minRange;i<=maxRange;i++){
 * int temp=0;
 * for(int j=1;j<i;j++){
 * if(i%j==0||i==1)
 * temp++;
 * }
 * if(temp==1)
 * primeNumbers.add(i);
 * }
 * System.out.println(primeNumbers);
 * sc.close();
 * }
 * }
 */