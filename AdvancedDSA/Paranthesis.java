package AdvancedDSA;
import java.util.*;

class Paranthesis{
    public int ans(String s, int n){
        int count = 0;
        int j = 0;
        for(int i = 1; i < n; i ++, j ++){
            if(s.charAt(i) == ')' && s.charAt(j) == '(')
                count ++;
        }

        return count;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        Paranthesis obj = new Paranthesis();
        System.out.println(obj.ans(s, n));
    }
}