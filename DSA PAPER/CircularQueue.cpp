#include<iostream>
using namespace std;
#define n 100

class queue{
    int* arr;
    int front;
    int rear;

    public:
    queue(){
        arr=new int[n];
        front=-1;
        rear=-1;
    }

    void enqueue(int x)
    {
        if(rear==n-1)
        {
            cout<<"overflow";
            return;
        }
        else if(front==-1)
        {
            front++;
        }

        rear++;
        arr[rear]=x;
    }

    void dequeue()
    {
            if(front == -1 || front>rear)
            {
                cout<<"no element to pop"<<endl;
                return;
            }
            else if(front ==0 && rear==0)
            {
                front ==-1;
                rear==-1;
            }
            else
                front++;
    }

    int peek()
    {
        if(front==-1 || front>rear)
            {
                cout<<"No element in queue";
                return -1;
            }
        return arr[front];
    }

    bool isfull()
    {
        return ((rear+1)%n==front);
    }

    bool empty()
    {
        return (front==-1 || rear==-1);
    }
};

int main()
{
    queue q;
    int a,b,x=1;
    while(x)
    {
        cout<<"enter 1 for enqueue, 2 for dequeue , 3 for peek and  for isempty"<<endl;
        cin>>a;
        if(a==1)
        {
            int t;
            cout<<"enter element"<<endl;
            cin>>t;
            q.enqueue(t);
        }
        else if(a==2)
        {
            q.dequeue();
        }
        else if(a==3)
        {
            cout<<q.peek()<<endl;
        }
        else if(a==4)
        {
            cout<<q.empty()<<endl;
        }
        cout<<"enter 1 to continue and 0 to exit"<<endl;
        cin>>b;
        if(b==0)
        {
            x=0;
        }
    }
    
    // q.enqueue(1);
    // q.enqueue(2);
    // q.enqueue(3);
    
    // cout<<q.peek()<<endl;
    // q.dequeue();
    // cout<<q.peek()<<endl;
    // q.dequeue();
    // cout<<q.peek()<<endl;
    // q.dequeue();

    // cout<<q.empty();
}