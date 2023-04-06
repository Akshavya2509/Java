package Sorting;

public class IterativeMergeSort {

    public static void conquer(int arr[], int si, int mid, int ei)
    {
        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while(idx1 <= mid && idx2 <= ei)
        {
            if(arr[idx1] <= arr[idx2])
            {
                merged[x++] = arr[idx1++]; //jayega x mein, aur jaane ke baad increment hojayega
            }

            else
            {
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid)
        {
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
        int mid = si + (ei - si) / 2;
        int EndIdx = mid, mid1 = 0;
        for(int i = 1; i <= 2; i ++)
        {
            mid1 = si + (EndIdx - si) / 2;

            for(int j = 0; i <= EndIdx; j ++)
            {
                if(j == mid1)
                {
                    conquer(arr, mid + 1, mid + 1, EndIdx);
                    continue;
                }
                if(Math.pow(2, j) > EndIdx)
                {
                    conquer(arr, si, j, EndIdx);
                }
                conquer(arr, si, j, (int)Math.pow(2, j));
            }

            si = mid + 1;
            EndIdx = ei;
        }
    }
    public static void main(String[] args) {
        
    int arr[] = {6, 2, 9, 5, 2, 8};
    
    int n = arr.length;

    divide(arr, 0, n - 1);

    for(int i = 0; i < n; i ++)
    {
        System.out.print(arr[i] + " ");
    }
    
}

}

