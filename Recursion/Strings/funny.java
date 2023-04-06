package Recursion.Strings;
import java.util.Scanner;

public class funny {

	private static boolean funny1(String s1, StringBuilder s2, int n)
	{
		for(int i = 0; i < n - 1; i ++)
		{
			if(Math.abs((int)s2.charAt(i) - (int)s2.charAt(i + 1)) != Math.abs((int)s1.charAt(i) - (int)s1.charAt(i + 1)))
				return false;
		}

		return true;
	}
	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);

        int q = sc1.nextInt();

		while(q != 0)
		{
            Scanner sc = new Scanner(System.in);
			String s1 = sc.nextLine();

			StringBuilder s = new StringBuilder();

			s = s.append(s1);
			s.reverse();

			if(funny1(s1, s, s.length()))
				System.out.println("Funny");

			else
				System.out.println("Not Funny");

			--q;
		}
	}

}
