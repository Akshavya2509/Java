import java.util.*;
public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i ++)
        {
            for(int j = 0; j <= n; j ++)
            {
                if(i > 0 && i < n-1)
                {
                    if(j > 0 && j < n)
                    {
                        System.out.print("  ");
                    }

                    else
                    {
                        System.out.print("* ");
                    }
                }

                else
                {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}
