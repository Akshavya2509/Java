
import java.util.*;

class FCFS
{
    public static void ProcessWT(int n, int Process[], int WT[], int BT[])
    {

        WT[0] = 0;

        int i;

        for(i = 1; i < n; i ++)
        {
            WT[i] = WT[i-1] + BT[i-1];
        }
    }

    public static void ProcessTAT(int n, int Process[], int WT[], int BT[], int TAT[])
    {
        int i;

        for(i = 0; i < n; i ++)
        {
            TAT[i] = BT[i] + WT[i];
        }
    }

        public static void main(String args[])
        {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of processes ");

            int n = sc.nextInt();

            System.out.println("Enter the process array");
            int proc[] = new int[n];

            int i;

            for(i = 0; i < n; i ++)
            {
                proc[i] = sc.nextInt();
            }

            int burstTime[] = new int[n];

            System.out.println("Enter the burst time array ");
            for(i = 0; i < n; i ++)
            {
                burstTime[i] = sc.nextInt();
            }

            int WaitTime[] = new int[n];

            ProcessWT(n, proc, WaitTime, burstTime);

            int TurnAroundTime[] = new int[n];

            ProcessTAT(n, proc, WaitTime, burstTime, TurnAroundTime);

            System.out.println("TurnAroundTime");
            for(i = 0; i < n; i ++)
            {   
                System.out.println(TurnAroundTime[i]);
            }

            System.out.println("Waiting Time");
            for(i = 0; i < n ; i ++)
            {
                System.out.println(WaitTime[i]);
            }
        }
}
