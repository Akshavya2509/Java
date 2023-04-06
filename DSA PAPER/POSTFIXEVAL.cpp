#include<iostream>
#include<math.h>
using namespace std;
#define p 1000
class stack1
{
    int *arr;

    int top;

    public:
    stack1()
    {
        arr = new int[p];
        top = -1;
    }

    void push(int x)
    {
        if(top == p-1)
        {
            cout << "Stack Overflow" << endl;
            return;
        }
        top ++;
        arr[top] = x;
    }

    void pop()
    {
        if(top == -1)
        {
            cout << "Stack Empty" << endl;
            return;
        }

        top --;
    }

    int Top()
    {
        if(top == -1)
        {
            cout << "Stack Empty" << endl;
            return -1;
        }
        return arr[top];
    }

    bool empty()
    {
        return top == -1;
    }
};

int postfixEval(string s)
{
    stack1 st;

    for(int i = 0; i < s.length(); i++)
    {
        if(s[i] >= '0' && s[i] <= '9')
        {
            st.push(s[i] - '0');
        }

        else
        {
            int op2 = st.Top();
            st.pop();
            int op1 = st.Top();
            st.pop();

            switch (s[i])
            {

                case '+' :

                st.push(op1+op2);
                break;

                case '-' :

                st.push(op1-op2);
                break;

                case '*' :

                st.push(op1*op2);
                break;

                case '/' :

                st.push(op1/op2);
                break;
                
                case '^' :

                st.push(pow(op1,op2));
                break;
            }
        }
    }

    return st.Top();
}

int main()
{
    cout << postfixEval("46+2/5*7+") << endl;
    return 0;
}