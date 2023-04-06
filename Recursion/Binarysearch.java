package Recursion;

import java.util.Arrays;

public class Binarysearch {
    public static boolean BFind(int arr[], int si, int ei, int k)
    {
        if(si > ei)
            return false;

            int mid = si + (ei - si) / 2;

            if(arr[mid] == k)
                return true;

            if(arr[mid] < k)
                return BFind(arr, mid + 1, arr.length - 1, k);

            else
                return BFind(arr, si, mid - 1, k);
        }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};

        int key = 7;

        System.out.println(BFind(arr, 0, arr.length - 1, key));
    }
}
