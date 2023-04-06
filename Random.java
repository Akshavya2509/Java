import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0)
        {
            int n = sc.nextInt(), count = 0;
            String s = sc.nextLine();

            if(n == 2)
            {
                if(s.charAt(0) == s.charAt(1))
                {
                    System.out.println("1");
                }

                else{
                    System.out.println("0");
                }
            }

            else{

                for(int i = 0; i <= (n / 2) - 1; i ++)
                {
                    if(s.charAt(i) == '1' && s.charAt(i + 1) == '0' || s.charAt(i) == '0' && s.charAt(i + 1) == '1')
                    {
                        count ++;
                        break;
                    }
                }

                if(count == 0)
                {
                    System.out.println("0");
                }

                else
                {
                    System.out.println("1");
                }
            }
            t --;
        }
    }
}