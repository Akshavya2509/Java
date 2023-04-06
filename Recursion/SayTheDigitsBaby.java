package Recursion;
import java.util.*;
public class SayTheDigitsBaby {

    public static void SayItbaby(int n, String arr[])
    {
        if(n == 0)
            return;

        SayItbaby(n/10, arr);

        System.out.print(arr[n%10] + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arr[] = {"zero", "One", "Two",
                        "Three", "Four", "Five",
                        "Six", "Seven", "Eight",
                        "Nine"};
        SayItbaby(sc.nextInt(), arr);
    }
}
