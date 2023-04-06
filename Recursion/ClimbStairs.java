// This is not optimized as it will be solved using DP

package Recursion;
import java.util.*;
class ClimbStairs {
    public static int climbStairs(int n) {
        if(n < 0)
            return 0;
        else if(n == 0)
            return 1;

        int ans = climbStairs(n - 1) + climbStairs(n - 2);

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(climbStairs(sc.nextInt()));
    }
}