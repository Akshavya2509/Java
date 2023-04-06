#include<iostream>
using namespace std;
#define p 1000
class stack
{
    char *arr;

    int top;

    public:
    stack()
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

bool isValid(string s)
{
    stack st;
    
    int n = s.size();
    
    bool ans = true;
    for(int i = 0; i < n; i ++)
    {
        if(s[i] == '{' || s[i] == '(' || s[i] == '[')
        {
            st.push(s[i]);
        }

        else if(s[i] == ')')
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

        else if(s[i] == '}')
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

        else if(s[i] == ']')
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
int main()
{
    string s = "[{()]}";

    if(isValid(s))
    {
        cout << " Valid String" << endl;
    }

    else
    {
        cout << "Invalid String" << endl;
    }
    return 0;
}