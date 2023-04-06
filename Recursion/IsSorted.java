package Recursion;
import java.util.*;
public class IsSorted {

    public static boolean isSorted(int arr[], int size)
    {
        if(size == 0 || size == 1)
            return true;
        if(arr[0] > arr[1])
            return false;

        boolean remaining_part = isSorted(Arrays.copyOfRange(arr, 1, size), size - 1);

        return remaining_part;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {2,4,6,8,9};
        int size = 5;

        boolean ans = isSorted(arr, size);

        System.out.println(ans);
    }
}
