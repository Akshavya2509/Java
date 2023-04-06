#include<iostream>
#include<stack>
#include<math.h>
using namespace std;
#define p 1000
class stack2
{
    char *arr;

    int top;

    public:
    stack2()
    {
        arr = new char[p];
        top = -1;
    }

    void push(char x)
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

    char Top()
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

int prefixEval(string s)
{
    stack2 st;
    for(int i = s.length()-1; i >= 0; i --)
    {
        if(s[i] >= '0' && s[i] <= '9')
        {
            st.push(s[i] -'0');
        }


        else
        {
            int op1 = st.Top();
            st.pop();
            int op2 = st.Top();
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

    cout << prefixEval("-+7*45+20") << endl;
    return 0;
}