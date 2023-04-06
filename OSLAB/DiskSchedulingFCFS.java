/* AKSHAVYA AGGARWAL */

import java.util.*;
public class DiskSchedulingFCFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the DiskHead");
        int diskHead = sc.nextInt();

        System.out.println("Enter the number of traversals");
        int n = sc.nextInt();

        System.out.println("Enter the Traversals");
        int a[] = new int[n];

        for(int i = 0; i  <n; i ++)
        {
            a[i] = sc.nextInt();
        }

        int seekTime = 0;

        int prev = diskHead;
        int next = a[0];

        for(int i = 1; i <= n ; i++)
        {
            if(prev > next)
            {
                seekTime += prev - next;
            }

            else
            {
                seekTime += next - prev;
            }

            if(i < n)
            {
                prev = next;
                next = a[i];
            }
        }

        System.out.println("Seek Time will be : " + seekTime);
    }

}
