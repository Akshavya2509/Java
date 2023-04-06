#include<iostream>
using namespace std;

class queue
{
    int *arr;
    int front;
    int back;
    int n;

    public:

    queue(int k)
    {
        n = k;
        arr = new int[n];
        front = -1;
        back = -1;
    }

    void enqueue(int x)
    {
        if(back == n-1)
        {
            cout << "QueueOverflow" << endl;
            return;
        }

        back ++;
        arr[back] = x;

        if(front == -1)
        {
            front ++;
        }
    }

    void dequeue()
    {
        if(front == -1 || front > back)
        {
            cout << "Queue Empty" << endl;
            return;
        }

        front ++;
    }

    int peek()
    {
        if(front == -1 || front > back)
        {
            cout << "Queue Empty" << endl;
            return -1;
        }

        return arr[front];
    }

    bool empty()
    {
        if(front == -1 || front > back)
        {
            return true;
        }

        return false;
    }
};

void frequency(int n)
{

    queue q1(n);

    cout << "Fill the queue" << endl;

    int big = 0;

    for(int i = 0; i < n; i ++)
    {
        int x;

        cin >> x;

        q1.enqueue(x);
    }

    int count = 0;

    int a[n];

    for(int i = 0; i < n; i ++)
    {
       a[i] = q1.peek();
       q1.dequeue();
    }
// Bubble Sorting

    for(int i = 0; i < n; i ++)
    {
        for(int j = 0; j < n; j ++)
        {
            if(a[i] < a[j])
            {
                a[i] = a[i] + a[j];
                a[j] = a[i] - a[j];
                a[i] = a[i] - a[j];
            }
        }
    }

    for(int i = 0; i < n; i ++)
    {
        cout << a[i] << " " << endl;
    }
    int p = 0;

    for(int i = 0; i < n; i ++)
    {
        count = 0;

        for(int j = 0; j < n; j ++)
        {
            if(a[i] == a[j])
            {
                count ++;
                p = j;
            }
        }
        i = p + 1;

        cout << a[i] << " Comes " << count << " Times" << endl;
    }
}

int main()
{
    cout << "Enter the totals number of values you want to enter" << endl;

    int n;

    cin >> n;

    frequency(n);

    return 0;
}

