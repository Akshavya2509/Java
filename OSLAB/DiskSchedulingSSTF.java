
import java.util.*;

public class DiskSchedulingSSTF {

    public static int[] delete(int n, int arr[], int pos)
    {
        n -= 1;

        int newarr []= new int[n];

        for(int i = 0; i < n; i ++)
        {
            if(i >= pos)
            {
                int j = i + 1;
                newarr[i] = arr[j];
            }

            else 
            {
                newarr[i] = arr[i];
            }
        }

        return newarr;
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the DiskHead");
            int diskHead = sc.nextInt();

            System.out.println("Enter the number of traversals");
            int n = sc.nextInt();

            System.out.println("Enter the Traversals");
            int a[] = new int[n];
            
            int flag[] = new int[n];

            for(int i = 0; i < n; i ++)
            {
                a[i] = sc.nextInt();
                flag[i] = 0;
            }
            
            int seekTime = 0;
            int small = 0;
            int k = 0;

            for(int i = 0; i < n; i ++)
            {
                small = 100000;
                for(int j = 0; j < n; j ++)
                {
                    if(flag[j] == 1)
                    {
                        continue;
                    }

                    if(diskHead > a[j] && diskHead - a[j] < small)
                    {
                        small = diskHead - a[j];
                        k = j;
                    }

                    else if(diskHead < a[j] && a[j] - diskHead < small)
                    {
                        small = a[j] - diskHead;
                        k = j;
                    }
                }

                
                seekTime += small;
                diskHead = a[k];
                flag[k] ++;
            }

            System.out.println(seekTime);
        }
}
