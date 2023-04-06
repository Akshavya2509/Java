import java.util.*;

public class riya {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, budget = 0, sum = 0, count = 0;

        n = sc.nextInt();

        int []refuelingCosts = new int[n];

        int []maintenanceCosts = new int[n];

        for (int i = 0; i < n; i++) {

            refuelingCosts[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {

            maintenanceCosts[i] = sc.nextInt();

        }

        budget = sc.nextInt();
        sc.close();

        Arrays.sort(refuelingCosts);
        Arrays.sort(maintenanceCosts);

        for (int i = n - 1; i >= 0; i--) {

            if (refuelingCosts[i] + sum <= budget) {

                sum += maintenanceCosts[i];
                count++;

            } 
            
            else
                break;
        }
        System.out.println(count);
    }
}