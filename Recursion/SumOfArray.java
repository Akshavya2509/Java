package Recursion;

import java.util.Arrays;

public class SumOfArray {
    public static int arrSum(int arr[], int len)
    {
        if(len <= 0)
            return 0;
            
        return arr[0] + arrSum(Arrays.copyOfRange(arr, 1, arr.length), len - 1);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,5,1,6};

        System.out.println(arrSum(arr, arr.length));
    }
}
