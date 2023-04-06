import java.util.*;

class Nqueens
{
    static Scanner sc = new Scanner(System.in);
    static int pk = sc.nextInt();
    public static int arr[] = new int[pk];

    private static boolean Place(int q, int n)
    {
        for(int i = 1; i < q - 1; i ++)
        {

        }
        return true;
    }
    private static int NQueens(int q, int n)
    {
        for(int i = 0 ; i < n ; i ++)
        {
            if(Place(q, i))
            {
                arr[q] = i;
            }

            if(q == n)
            {
                for(int j = 0; j < pk; j ++)
                {
                    System.out.println(arr[j]);
                }
            }

            NQueens(q + 1, n);
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        NQueens(1, q);
    }
}