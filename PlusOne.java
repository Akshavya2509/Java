import java.util.*;
class PlusOne {
    public static int[] plusOne(int[] digits) {

        int i = 0;
        int j = digits.length-1;

        int number = 0, pow = 0, count = 0;

        while(i<digits.length)
        {
            if(j!=0)
            {
                pow =(int) Math.pow(10, j);
            }

            else
            {
                pow = 1;
            }

            number += digits[i]*pow;

            i++;
            j--;
        }

        number = number + 1;

        int num = number;

        while(num != 0)
        {
            num = num/10;
            count ++;
        }

        i = count - 1;

        int a[] = new int[count];

        while(i >= 0)
        {
            a[i] = number%10;

            number = number/10;
            i--;
        }

        return a;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        int arr[] = plusOne(a);

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]);
        }
    }
}