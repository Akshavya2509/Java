import java.util.*;
public class SRTF {
    public static void main(String argsp[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        int b [] = new int[n];

        int w[] = new int[n];

        int rbt[] = new int[n];

        for(int i = 0; i < n ; i ++)
        {
            a[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n ; i++)
        {
            b[i] = sc.nextInt();
            rbt[i] = b[i];
        }

        int completed = 0;
    }
}
