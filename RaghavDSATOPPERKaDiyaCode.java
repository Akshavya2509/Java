import java.util.*;

public class RaghavDSATOPPERKaDiyaCode{
    public int TopperAsli(int arr[]){
        int l = 0, r = arr.length - 1;

        for(int i = 0, j = arr.length - 1; i < arr.length/ 2; i ++, j --){
            if(arr[i] > arr[l])
                l = i;

            if(arr[j] < arr[r]) r = j;
        }

        for(int i = l + 1; i < r; i ++){
            if(arr[i] > arr[l]) l = i;
        }

        return arr[l] - arr[r];20
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Raghav bhaiya btao kitna lmba chahiye, array >_<?");
        int n = sc.nextInt();

        System.out.println("Ghuswao abh andar, values >_< ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();
        }
        RaghavDSATOPPERKaDiyaCode ans = new RaghavDSATOPPERKaDiyaCode();
        System.out.println(ans.TopperAsli(arr));
    }
}