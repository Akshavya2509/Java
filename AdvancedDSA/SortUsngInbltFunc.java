package AdvancedDSA;
import java.util.*;

public class SortUsngInbltFunc {
    static class arr{
        static int profit;
        static int deadline;
    
        arr(int profit, int deadline)
        {
            this.profit = profit;
            this.deadline = deadline;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr a[] = new arr[n];

        for(int i = 0; i < n ; i ++)
        {
            a[i].profit = sc.nextInt();
            a[i].deadline = sc.nextInt();
        }

        Arrays.sort(a);

        for(int i = 0; i < n; i ++)
        {
            System.out.println(a[i].profit);
        }

        for(int i = 0; i < n; i ++)
        {
            System.out.println(a[i].deadline);
        }
    }
}
