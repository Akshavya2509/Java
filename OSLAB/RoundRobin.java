import java.util.Scanner;  
public class RoundRobin  
{  
    public static int[] insert(int n, int arr[], int pos, int x)
    {
        n = n + 1;

        int newarr[] = new int[n];

        for(int i = 0; i < n; i ++)
        {
            if(i < pos)
            newarr[i] = arr[i];

            else if(i == pos)
            {
                newarr[i] = x;
            }

            else if(i > pos)
            {
                newarr[i] = arr[i-1];
            }
        }

        return newarr;
    }
    
    public static void main(String args[])  
    {  
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the time quantum");
        int TQ = sc.nextInt();
        
        System.out.println("Enter the Number of Processes");
        int n = sc.nextInt();

        int AT[] = new int[n], BT[] = new int[n], WT[] = new int[n], RQ[] = new int[1];
        
        System.out.println("Enter the Arrival time");

        for(int i = 0;i < n; i ++)
        {
            AT[i] = sc.nextInt();
        }

        System.out.println("Enter the Burst Time");

        for(int i = 0; i < n; i ++)
        {
            BT[i] = sc.nextInt();
        }

        int curr_time = 0;
        int completed = 0;
        int k = 0, p = 0;
        int procchk = 0;

        int c = RQ.length;
        
        for(int i = 0; i < n; i ++)
        {
            if(AT[i] <= curr_time)
            {
                if(procchk == 0)
                {
                    RQ[0] = i;
                    procchk ++;
                }
                else
                {
                    RQ = insert(c, RQ, procchk, i);
                    procchk = i;
                }
            }

            else 
            break;
        }

        while(completed != n)
        {

            for(int i = 0; i < TQ; i ++)
            {
                if(BT[RQ[k]] == 0)
                {
                    k ++;
                    completed ++;
                    continue;
                }

                BT[RQ[k]] --;
                curr_time ++;

                for(int j = procchk; j < n; j ++)
                {
                    if(AT[j] <= curr_time)
                    {
                        RQ = insert(RQ.length, RQ, p, j);
                        procchk ++;
                        p = procchk;
                    }
    
                    else 
                    break;
                }

                for(int o = k + 1; o < RQ.length; o ++)
                {
                    WT[RQ[o]] ++;
                }
            }

            if(BT[RQ[k]] == 0)
            {
                continue;
            }

            else
            {
                RQ[p] = RQ[k];
                p++;
            }
        }

        for(int i = 0; i < n; i ++)
        {
            System.out.println(WT[i] + " is the waiting time for process " + (i + 1));
        }
    }  
}