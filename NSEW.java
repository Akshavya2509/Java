import java.util.*;

class NSEW
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int x = 0, y = 0;

        for(int i = 0; i < s.length(); i ++)
        {
            if((int)s.charAt(i) >= 48 && (int)s.charAt(i) <= 57)
            {
                if(s.charAt(i + 1) == 'N')
                {
                    y += ((int)s.charAt(i) - 48);
                }

                else if(s.charAt(i + 1) == 'S')
                {
                    y -= ((int)s.charAt(i) - 48);
                }

                else if(s.charAt(i + 1) == 'W')
                {
                    x -= ((int)s.charAt(i) - 48);
                }

                else
                {
                    x += (int)s.charAt(i) - 48;
                }
            }
        }

        System.out.println("(" + x + "," + y + ")");
    }
}