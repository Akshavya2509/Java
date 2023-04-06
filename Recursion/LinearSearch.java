package Recursion;

import java.util.Arrays;

public class LinearSearch {
    public static boolean find(int arr[], int k, int len)
    {
        if(len == 0)
            return false;

        if(k == arr[0])
            return true;
        else
        {
            boolean isTrue = find(Arrays.copyOfRange(arr, 1, arr.length), k, len - 1);
            return isTrue;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,8};

        int key = 6;

        boolean isTrue = find(arr, key, arr.length);

        System.out.println(isTrue);
    }
}
