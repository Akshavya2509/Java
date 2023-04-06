package Sorting;
import java.util.Scanner;
public class SelectionSort
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n ; i ++)
        {
            a[i] = sc.nextInt();
        }

        int minimum;
        
        for(int i = 0; i < n - 1; i ++)
        {
            minimum = i;

            for(int j = i + 1; j < n; j ++)
            {
                if(a[j] < a[minimum])
                {
                    minimum = j;
                }
            }

            a[minimum] = a[minimum] + a[i];
            a[i] = a[minimum] - a[i];
            a[minimum] = a[minimum] - a[i];
        }

        for(int i = 0; i < n; i ++)
        {
            System.out.print(a[i] + " ");
        }
    }
}