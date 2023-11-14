import java.util.* ;
import java.io.*; 
public class CNInversionCount {
    static long c = 0;

    public static void conquer(long arr[], int strtIdx, int mid, int EndIdx)
    {
        long merged[] = new long[EndIdx - strtIdx + 1];
        int idx1 = strtIdx;
        int idx2 = mid + 1;
        int x = 0;
        long count = 0;

        while(idx1 <= mid && idx2 <= EndIdx)
        {
            if(arr[idx1] <= arr[idx2])
            {
                merged[x ++] = arr[idx1 ++];
            }

            else{
                /* 
                if(count == 0)
                c += idx2 - idx1;

                else*/

                c += idx2 - idx1 - count;

                merged[x ++] = arr[idx2++];

                // count will fix the array
                count ++;
            }
        }
        while(idx1 <= mid)
        {
            merged[x++] = arr[idx1++];  
        }

        while(idx2 <= EndIdx)
        {
            merged[x++] = arr[idx2++];
        } 

        for(long i = 0, j = strtIdx; i < merged.length; i ++, j ++)
        {
            arr[j] = merged[i];
        }
    }

    public static void divide(long arr[], int strtIdx, int EndIdx)
    {
        if(strtIdx >= EndIdx)
        {
            return;
        }

        int mid = strtIdx + (EndIdx - strtIdx) / 2;

        divide(arr, strtIdx, mid);
        divide(arr, mid+1, EndIdx);
        conquer(arr, strtIdx, mid, EndIdx);
    }
    public static long getInversions(long arr[], long n) {
        // Write your code here.
        divide(arr, 0, (int)n - 1);

        return c;
    }
}