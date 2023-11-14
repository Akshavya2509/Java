package Blockchain;
import java.util.*;
public class sort012 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t != 0)
        { 
            t --;
            int n = sc.nextInt();

            int arr[] = new int[n];

            for(int i = 0; i < n; i ++)
                arr[i] = sc.nextInt();

            arr = sort012(arr);

            for(int i : arr)
                System.out.print(i + " ");          
        }
    }
    public static int[] sort012(int[] arr)
    {
        //Write your code here

        int nums[] = new int[3];

        for(int i = 0; i < arr.length; i ++)
            nums[arr[i]] ++;
        int j = 0;
        for(int i = 0; i < arr.length; i ++)
        {
            if(nums[j] == 0){
                j ++;
                i --;
                continue;
            }
            arr[i] = j;
            nums[j] --;
        }

        return arr;
    }
}
