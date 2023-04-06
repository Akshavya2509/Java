package Recursion.Strings;

public class ReverseString {
    private static void reverse(String s, int i, int j)
    {
        if(i > j)
            return;
        
    }
    public static void main(String[] args) {
        String s = "abcde";

        System.out.println(reverse(s, 0, s.length() - 1));
    }
}
