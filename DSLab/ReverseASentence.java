package DSLab;
import java.util.*;

public class ReverseASentence {
    
    
    String s, revS = "";

    int n = 1000;

    int top;

    char arr[] = new char[n];

    ReverseASentence(String s)
    {
        this.s = s;
        top = -1;
    }

    void push(char x)
    {
        if(top == n-1)
        {
            System.out.println("Stack Overflow");

            return;
        }
        top ++;
        arr[top] = x;

        revS += arr[top];
    }

    void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack Empty");
            return;
        }

        top --;
    }

     char Top()
    {
        if(top == -1)
        {
            System.out.println("Stack Empty");
            return '0';
        }
        
        return arr[top];
    }

    boolean empty()
    {
        return top == -1;
    }

    String reverse()
    {
        for(int i = s.length()-1; i >= 0; i --)
        {
            push(s.charAt(i));
        }

        return revS;
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        ReverseASentence ob = new ReverseASentence(s);

        System.out.println(ob.reverse());
    }   
}
