package Recursion;
import java.util.*;
public class factorial {

    public static int fact(int n)
    {
        if(n == 0)
            return 1;

        // return n * fact(n - 1);

        int smallprob = fact(n - 1);
        int bigprob = n * smallprob;

        return bigprob;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc  = new Scanner(System.in);

        n = sc.nextInt();

        int ans = fact(n);

        System.out.println(ans);
    }
}
