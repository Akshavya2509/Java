package Sorting;
import java.util.Scanner;
public class CountingSort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n; i ++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the range");

        int k = sc.nextInt();

        int b[] = new int[k + 1];
        for(int i = 0; i < n; i ++)
        {
            b[a[i]] ++;
        }

        int j = 0;

        for(int i = 0; i < n ; i ++)
        {
            if(b[j] != 0)
            {
                a[i] = j;
                b[j] --;
            }

            else
            {
                j ++;
                i --;
            }
        }

        for(int i = 0; i < n ; i ++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
