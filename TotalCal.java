import java.util.*;

public class TotalCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the different types of sweets");
        int n = sc.nextInt();
        sc.close();
        int price[] = new int[n];
        int calories[] = new int[n];
        int arrP[] = new int[n * n];
        int arrC[] = new int[n * n];
        int temp = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the price of Sweets\n" + i + "  ");
            price[i] = sc.nextInt();
            arrP[i] = price[i];
        }
        temp = n;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the calories of the Sweets\n" + i + "  ");
            calories[i] = sc.nextInt();
            arrC[i] = price[i];
        }
        System.out.println("Enter the AvailableBalance");
        int AvailableBalance = sc.nextInt();
        for (int i = 0; i < n; i++) // i= 0,1,2 temp 3 4 5 6
        {
            for (int j = i + 1; j < n; j++) {
                arrP[temp] = price[i] + price[j];
                arrC[temp] = calories[i] + calories[j];
                temp = temp + 1;
            }
        }
        for (int i = 0; i < n; i++) // i=0 j=1 k=2;
        {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    arrP[temp] = price[i] + price[j] + price[k];
                    arrC[temp] = calories[i] + calories[j] + calories[k];
                    temp = temp + 1;
                }
            }
        }
        ArrayList<Integer> TotalCalories = new ArrayList<>();
        for (int i = 0; i < arrP.length; i++) {
            if (AvailableBalance >= arrP[i])
                TotalCalories.add(arrC[i]);
        }
        for (int i = 0; i < TotalCalories.size(); i++)
            for (int j = i + 1; j < TotalCalories.size(); j++)
                if (TotalCalories.get(i) > TotalCalories.get(j))
                    Collections.swap(TotalCalories, i, j);
        System.out.println("Total calories of sweet bought is " + TotalCalories.get(TotalCalories.size() - 1));
    }
}