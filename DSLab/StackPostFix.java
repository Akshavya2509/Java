package DSLab;
import java.util.*;
public class StackPostFix
{
    String s;

    int n = 1000, top;

    int arr[] = new int[n];

    StackPostFix(String s)
    {
        this.s = s;
        top = -1;
    }

    public void push(int k)
    {
        if(top == n-1)
        {
            System.out.println("StackOverflow");
            return;
        }
        top ++;
        arr[top] = k;
    }
    
    public void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack Empty");
            return;
        }

        top --;
    }

    public int top()
    {
        return arr[top];
    }

    public int PostFix()
    {

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
            {
                push(s.charAt(i)- '0');
            }

            else
            {
                int op2 = top();
                pop();
                int op1 = top();
                pop();

                switch (s.charAt(i))
                {

                    case '+' :

                    push(op1+op2);
                    break;

                    case '-' :

                    push(op1-op2);
                    break;

                    case '*' :

                    push(op1*op2);
                    break;

                    case '/' :

                    push(op1/op2);
                    break;
                    
                    case '^' :

                    push((int)Math.pow(op1,op2));
                    break;
                }
            }
        }

        return arr[top];
    }
    
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);

        String s = sc.nextLine();

        StackPostFix ob = new StackPostFix(s);

        System.out.println(ob.PostFix());
        
    }
}

