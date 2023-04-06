package Sorting;
import java.util.*;
public class SelectionSort1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n ; i ++)
        {
            a[i] = sc.nextInt();
        }

        //Selection Sort O(n^2)

        for(int i = 0; i < n ; i ++)
        {
            int smallest = i;

            for(int j = i + 1; j < n; j ++)
            {
                if(smallest < a[j])
                {
                    smallest = j;
                }
            }

            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;
        }

        for(int i = 0; i < n ; i ++)
        {
            System.out.println(a[i]);
        }
    }
}
