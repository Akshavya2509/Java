
import java.util.*;
public class DiskSchedulingCSCAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the diskHead");
        
        int diskHead = sc.nextInt();

        System.out.println("Enter the number of traversals");
        
        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n; i ++)
        {
            a[i] = sc.nextInt();
        }

        int input, k = 0;

        System.out.println("Enter 0 for left and 1 for right");

        input = sc.nextInt();

        // The lastElement can be taken as a[n-1] + 10 (If not given) else the last one that is given

        if(input == 0)
        {
            for(int i = 0; i < n; i ++)
            {
                if(a[i] > diskHead)
                {
                    k = i;
                    break;
                }
            }
    
            System.out.println(diskHead + a[n-1] + 10 + a[n-1] + 10 - a[k]);
        }

        else if(input == 1)
        {
            for(int i = 0; i < n; i ++)
            {
                if(a[i] > diskHead)
                {
                    k = i - 1;
                    break;
                }
            }
    
            System.out.println(a[n-1] + 10 - diskHead + a[n-1] + 10 + a[k]);
        }
    }
}
