package Sorting;
import java.util.*;

// Worst case O(n^2), Average case Theta(nlogn)
public class QuickSort1 {

    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j ++)
        {
            if(arr[j] < pivot)
            {
                i ++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i ++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i;
    }
    public static void quicksot(int arr[], int low, int high)
    {
        if(low < high)
        {
            int pivot = partition(arr, low, high);

            quicksot(arr, low, pivot - 1);

            quicksot(arr, pivot + 1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i ++)
        {
            arr[i] = sc.nextInt();
        }

        quicksot(arr, 0, n - 1);

        for(int i = 0; i < n; i ++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
