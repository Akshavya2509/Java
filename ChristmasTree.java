import java.util.*;
public class ChristmasTree {

    public static void pyramid(int start, int n)
    {
        for(int i = start; i <= n; i ++)
        {
            for(int j = 1; j <= n - i; j ++)
            {
                System.out.print(" ");
            }

            for(int k = 1; k <= (2 * i) - 1; k ++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void base(int n)
    {
        for(int i = 0; i < n * 0.3 ;i ++)
        {
            for(int k = 1; k <= n * 0.75; k ++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j < n * 0.5 ; j ++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pyramid(1, n);
        pyramid(n/2, n);
        pyramid(n/2, n);

        base(n);
    }
}