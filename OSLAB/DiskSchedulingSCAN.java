
import java.util.*;
public class DiskSchedulingSCAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the diskHead");     
        int diskHead = sc.nextInt();

        System.out.println("Enter the number of traversals");
        int n = sc.nextInt();

        System.out.println("Enter the Traversals");
        int a[] = new int[n];

        for(int i = 0; i < n; i ++)
        {
            a[i] = sc.nextInt();
        }

        int input;

        System.out.println("Enter 0 for left and 1 for right");

        input = sc.nextInt();

        // The lastElement can be taken as a[n-1] + 10 (If not given)

        if(input == 0)
        {
            System.out.println(diskHead + a[n-1]);
        }

        else if(input == 1)
        {
            System.out.println(a[n-1] + 10 - diskHead + a[n-1] - a[0] + 10);
        }
    }
}
