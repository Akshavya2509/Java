#include<iostream>
using namespace std;


struct node
{
    /* data */
    int data;
    struct node* next;
}*top;

void init()
{
    top = NULL;
}

void push(int value)
{
    struct node *newNode;
    newNode = (struct node*)malloc(sizeof(struct node));
    newNode->data = value;

    if(top == NULL)
    {
        newNode->next = NULL;
    }

    else
    {
        newNode->next = top;
    }
    top = newNode;
}

void pop()
{
    if(top == NULL)
    {
        printf("UNDERFLOW\n");
    }

    else
    {
        struct node *temp = top;
        top = temp->next;
        free(temp);
    }
}

void display()
{
    if(top == NULL)
    {
        printf("Stack Empty\n");
    }

    else
    {
        struct node *temp = top;
        while(temp->next != NULL)
        {
            printf("%d--->",temp->data);
            temp = temp->next;
        }
        printf("%d--->NULL\n", temp->data);
    }

}

int main ()
 { 
    node *S;
    init();
    push(10);
    push(45);
    push(1);
    push(50);
    printf("Current stack : ");
    display();
    pop();
    pop();
    printf("After Pop Func, Stack : ");
    display();
    return 0;
 }