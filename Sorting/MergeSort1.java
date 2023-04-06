package Sorting;
import java.util.*;
public class MergeSort1 {

    // O(nLogn)
    public static void conquer(int arr[], int si, int mid, int ei)
    {
        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        // O(n)
        while(idx1 <= mid && idx2 <= ei)
        {
            if(arr[idx1] <= arr[idx2])
            {
                merged[x] = arr[idx1];
                x++;
                idx1++;
            }

            else
            {
                merged[x++] = arr[idx2 ++];
            }
        }

        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }

        while(idx2 <= ei)
        {
            merged[x++] = arr[idx2++];
        }

        for(int i = 0, j = si; i < merged.length; i ++, j ++)
        {
            arr[j] = merged[i];
        }
    }
    public static void divide(int arr[], int si, int ei)
    {
        if(si >= ei)
        {
            return;
        }

        // O(logn)
        int mid = si + (ei - si)/2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0 ;i < n ; i ++)
        {
            a[i] = sc.nextInt();
        }

        divide(a, 0, n - 1);

        for(int i = 0; i < n ; i ++)
        {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }
}