package DSLab;

public class BalancedParanthesis {

    char arr[];

    int top;

    int p = 1000;

    BalancedParanthesis()
    {
        arr = new char[p];
        top = -1;
    }

    void push(char x)
    {
        if(top == p-1)
        {
            System.out.println("Stack Overflow");
            return;
        }
        top ++;
        arr[top] = x;
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
            return '-';
        }
        return arr[top];
    }

    boolean empty()
    {
        return top == -1;
    }
    static boolean isValid(String s)
    {

        BalancedParanthesis st = new BalancedParanthesis();
        int n = s.length();
        boolean ans = true;
        for(int i = 0; i < n; i ++)
        {
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[')
            {
                st.push(s.charAt(i));
            }

            else if(s.charAt(i) == ')')
            {
                if(!st.empty() && st.Top() == '(')
                {
                    st.pop();
                }

                else
                {
                    ans = false;
                    break;
                }
            }

            else if(s.charAt(i) == '}')
            {
                if(!st.empty() && st.Top() == '{')
                {
                    st.pop();
                }

                else
                {
                    ans = false;
                    break;
                }
            }

            else if(s.charAt(i) == ']')
            {
                if(!st.empty() && st.Top() == '[')
                {
                    st.pop();
                }

                else
                {
                    ans = false;
                    break;
                }
            }
        }

        if(!st.empty())
        {
            return false;
        }
        return ans;
    }
    public static void main(String args[])
    {
        String s = "({[]})";

        if(isValid(s))
        {
            System.out.println("Valid Stirng");
        }

        else
        {
            System.out.println("Invalid String");
        }
    }
        
}
