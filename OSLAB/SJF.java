import java.util.*;

public class SJF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of processes");

        int n = sc.nextInt();

        int AT[] = new int[n];

        int BT[] = new int[n];

        int WT[] = new int[n];

        System.out.println("Enter the Arrival Time");

        for(int i = 0; i < n; i ++)
        {
            AT[i] = sc.nextInt();
        }

        System.out.println("Enter the Burst Time");

        for(int i = 0; i < n; i ++)
        {
            BT[i] = sc.nextInt();
        }

        int completed = 0, curr_time = 0;
        int j = 0;

        for(int i = 0; i < n; i ++)
        {
            for(j = 0; j < n; j ++)
            {
                if(BT[i] > BT[j])
                {
                    int temp = BT[i];
                    BT[i] = BT[j];
                    BT[j] = temp;

                    int temp2 = AT[i];
                    AT[i] = AT[j];
                    AT[i] = temp2;
                }
            }
        }

        while(completed <= n)
        {
            if(AT[j] != curr_time)
            {
                for(int i = j + 1; i < n; i ++)
                {
                    if(AT[i] <= curr_time)
                    {
                        WT[i] ++;
                    }
                }
                curr_time ++;
                continue;
            }

            for(int i = 0; i < BT[j]; i ++)
            {
                BT[j] --;
                curr_time ++;

                for(int k = j + 1; k < n; k ++)
                {
                    if(AT[k] <= curr_time)
                    {
                        WT[k] ++;
                    }
                }
            }
            
            j ++;
            completed ++;
        }

        for(int i = 0; i < n; i ++)
        {
            System.out.println("Waiting time of process " + i + " is " + WT[i]);
        }
    }
}
