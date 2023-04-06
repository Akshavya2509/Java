package Sorting;
import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i  <n; i ++)
        {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i ++)
        {
            for(int j = i - 1; j >= 0; j --)
            {
                if(a[j] > a[j + 1])
                {
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];
                }

                else
                {
                    break;
                }
            }
        }

        for(int i = 0; i < n; i ++)
        {
            System.out.print(a[i] + " " );
        }
    }
    
}
