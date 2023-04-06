package Recursion;
import java.util.*;
public class walkingexp {

    public static void reachHome(int src, int dest)
    {
        if(src == dest)
        {
            return;
        }
        System.out.println(src + "is the current position and the destination is " + dest);
        src ++;
        reachHome(src, dest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dest = sc.nextInt();

        int src = sc.nextInt();

        reachHome(src, dest);

        System.out.println("Reached Home");
    }
}
