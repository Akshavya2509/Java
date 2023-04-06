package Sorting;
import java.util.*;
public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();

        int arr[] = new int[n];

        int a[] = new int[n];

        int number[] = new int[k + 1];

        for(int i = 0; i < n ; i ++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < k; i ++)
        {
            number[i] = 0;
        }

        for(int i = 0; i < n; i ++)
        {
            number[arr[i]] ++;
        }

        int j = 0;

        for(int i = 0; i < n; i ++)
        {
            if(number[j] == 0)
            {
                j ++;
                i--;
                continue;
            }

            else
            {
                a[i] = j;
                number[j] --;
            }
        }

        for(int i = 0; i < n; i ++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
