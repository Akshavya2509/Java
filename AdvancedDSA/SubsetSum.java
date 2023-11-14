package AdvancedDSA;

import java.util.Scanner;

public class SubsetSum {

    static Scanner s = new Scanner(System.in);

    int m = s.nextInt();

    int a[] = new int[m];

    for(int i = 0; i < m; i ++)
    {
        a[i] = s.nextInt();
    }
    private static void SubArrSum(int s, int arr[], int r)
    {

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        SubArrSum(0, arr, sum);
    }
}
