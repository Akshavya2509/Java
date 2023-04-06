package Sorting;
import java.util.*;

public class BubbleSort1
{
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i  < n; i ++)
        {
            a[i] = sc.nextInt();
        }

        // Bubble Sort O(n^2)
        
        for(int i = 0; i < n ; i ++)
        {
            for(int j = 0; j < n - i - 1; j ++)
            {
                if(a[j] > a[j + 1])
                {
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];
                }
            }
        }

        for(int i = 0 ; i < n; i ++)
        {
            System.out.print(a[i] + " ");
        }
    }
}