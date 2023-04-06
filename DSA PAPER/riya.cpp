#include <iostream>
#include<stdlib.h>
using namespace std;
struct node
{
    int data;
    struct node *next;
    struct node *prev;
};
struct node *head;
void create()
{
    struct node *newnode=(struct node *)malloc(sizeof(struct node));
    struct node *temp;
    int num;
    cout<<"Enter data of node :"<<endl;
    cin>>num;
    newnode->data=num;
   
    if(head==NULL)
    {
        newnode->prev=NULL;
        newnode->next=NULL;
        head=newnode;
        temp=head;
    }
    else
    {
        temp->next=newnode;
        newnode->prev=temp;
        temp=newnode;
        newnode->next=NULL;
    }
}
void display()
{
    struct node *temp;
    temp=head;
    while(temp!=NULL)
    {
        cout<<temp->data<<" ";
        temp=temp->next;
    }
}
int main()
{
    create();
    create();
    create();
    display();
    return 0;
}