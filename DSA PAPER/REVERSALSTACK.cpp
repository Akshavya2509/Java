#include<iostream>
using namespace std;
#define n 1000
class stack
{
    char *arr;

    int t;

    public:
    stack()
    {
        arr = new char[n];
        t = -1;
    }

    void push(char x)
    {
        if(t == n-1)
        {
            cout << "Stack Overflow" << endl;
            return;
        }
        t ++;
        arr[t] = x;
    }

    void pop()
    {
        if(t == -1)
        {
            cout << "Stack Empty" << endl;
            return;
        }

        t --;
    }

    char Top()
    {
        if(t == -1)
        {
            cout << "Stack Empty" << endl;
            return -1;
        }
        
        return arr[t];
    }

    bool empty()
    {
        return t == -1;
    }
};

string reverse(string s)
{
    stack st;

    int m = s.size();

    for(int i = 0; i < m; i ++)
    {
        st.push(s[i]);
    }

    s = "";
    
    for(int i = 0; i < m; i ++)
    {
        s = s + st.Top();
        st.pop();
    }

    return s;
}

int main()
{
    cout << reverse("Hello") << endl;
    return 0;
}
