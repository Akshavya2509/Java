

import java.util.Scanner;

class PArtitioning
{
    // Insert function to create an extra node in the array for the lefover memory after some is allocated to the process
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

        Scanner sc = new Scanner(System.in);

        int ch;

        System.out.println("Enter 1 for first Fit, 2 for best Fit and 3 for Worst fit\n");

        ch = sc.nextInt();

        switch(ch)
        {
            // First Fit
            case 1:

            System.out.println("Enter the number of Processes \n");
            
            int n = sc.nextInt();

            int a[] = new int[n];

            System.out.println("Enter the sizes of each process \n");

            for(int i = 0; i < n; i ++)
            {
                a[i] = sc.nextInt();
            }

            System.out.println("Enter the number of memory Locations Available in the memory \n");

            int m = sc.nextInt();

            int mem[] = new int[m];

            int flag[] = new int[m];

            System.out.println("Enter the amount of memory each holds\n");

            for(int i = 0; i < m; i ++)
            {
                mem[i] = sc.nextInt();
                flag[i] = 0;
            }

            for(int i = 0; i < n; i ++)
            {
                for(int j = 0; j < m; j ++)
                {
                    if(flag[j] != 0)
                    {
                        continue;
                    }

                    else if(a[i] <= mem[j])
                    {
                        if(a[i] < mem[j] && flag[j] != 1)
                        {
                            int pos = j+1;

                            int x = mem[j] - a[i];

                            mem = insert(m, mem, pos, x);

                            flag = insert(m, flag, j+1, 0);

                            m = m + 1;
                        }

                        mem[j] = a[i];
                        flag[j] = 1;
                        break;
                    }
                }
            }

            System.out.println("Output\n");

            for(int i = 0; i < m; i ++)
            {
                System.out.println(mem[i]);
            }
            break;

            case 2:

            //Best Fit

            System.out.println("Enter the number of Processes \n");
            
            int p = sc.nextInt();

            int proc[] = new int[p];

            System.out.println("Enter the sizes of each process \n");

            for(int i = 0; i < p; i ++)
            {
                proc[i] = sc.nextInt();
            }

            System.out.println("Enter the number of memory Locations Available in the memory \n");

            int me = sc.nextInt();

            int memo[] = new int[me];

            int flag1[] = new int[me];

            System.out.println("Enter the amount of memory each holds\n");

            for(int i = 0; i < me; i ++)
            {
                memo[i] = sc.nextInt();
                flag1[i] = 0;
            }

            int max = memo[0];
            int j1;

            for(int i = 0; i < p; i ++)
            {
                j1 = 0;

                for(int j = 1; j < me; j ++)
                {
                    if(flag1[j] != 0)
                    {
                        continue;
                    }

                    else if(max < proc[i] && memo[j] >= proc[i])
                    {
                        max = memo[j];
                        j1 = j;
                    }

                    else if(max >= memo[j] && memo[j] >= proc[i])
                    {
                        max = memo[j];
                        j1 = j;
                    }
                }
                if(proc[i] < memo[j1] && flag1[j1] != 1)
                {
                    int pos = j1+1;

                    int x = memo[j1] - proc[i];

                    memo = insert(me, memo, pos, x);

                    flag1 = insert(me, flag1, pos, 0);

                    me = me + 1;
                }
                memo[j1] = proc[i];

                System.out.println();

                System.out.println("Memory allocated to process p1 is " + memo[j1] + " at position " + j1 );
                
                flag1[j1] = 1;
            }

            System.out.println("Output\n");

            for(int i = 0; i < me; i ++)
            {
                System.out.println(memo[i]);
            }

            break;

            case 3:

            //Worst Fit

            System.out.println("Enter the number of Processes \n");
            
            int pr = sc.nextInt();

            int proce[] = new int[pr];

            System.out.println("Enter the sizes of each process \n");

            for(int i = 0; i < pr; i ++)
            {
                proce[i] = sc.nextInt();
            }

            System.out.println("Enter the number of memory Locations Available in the memory \n");

            int mr = sc.nextInt();

            int memor[] = new int[mr];

            int flag2[] = new int[mr];

            System.out.println("Enter the amount of memory each holds\n");

            for(int i = 0; i < mr; i ++)
            {
                memor[i] = sc.nextInt();
                flag2[i] = 0;
            }

            int maxi = memor[0];
            int j2;

            for(int i = 0; i < pr; i ++)
            {
                j2 = 0;
                maxi = 0;

                for(int j = 0; j < mr; j ++)
                {
                    if(flag2[j] != 0)
                    {
                        continue;
                    }

                    else if(memor[j] > maxi)
                    {
                        maxi = memor[j];
                        j2 = j;
                    }
                }
                if(proce[i] < memor[j2])
                {
                    int pos = j2+1;

                    int x = memor[j2] - proce[i];

                    memor = insert(mr, memor, pos, x);

                    flag2 = insert(mr, flag2, pos, 0);

                    mr = mr + 1;
                }
                memor[j2] = proce[i];

                System.out.println();

                System.out.println("Memory allocated to process p1 is " + memor[j2] + " at position " + j2 );
                
                flag2[j2] = 1;
            }

            System.out.println("Output\n");

            for(int i = 0; i < mr; i ++)
            {
                System.out.println(memor[i]);
            }

            break;
        }
    }
}