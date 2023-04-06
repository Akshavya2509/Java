import java.util.*;
public class SJF2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];
        int w[] = new int[n];

        for(int i = 0; i < n; i ++)
        {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i  <n ; i++)
        {
            b[i] = sc.nextInt();
        }

        int completed = 0;

        while(completed != n)
        {
            int minBT = 0;

            for(int i = 0; i < n; i ++)
            {
                if(b[i] < b[minBT])
                {
                    minBT = i;
                }
            }

            for(int i = 0; i  <n; i ++)
            {
                if(a[i] < a[minBT])
                {
                    w[i] ++;
                }
            }

            b[minBT] = 0;
            completed ++;
        }

        for(int i = 0; i < n; i ++)
        {
            System.out.println(w[i]);
        }

        for(int i = 0; i < n ; i++)
        {
            System.out.println(w[i] + b[i]);
        }
    }
}
