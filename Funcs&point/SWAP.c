#include<stdio.h>

void swap(int *a, int *b)
{
    int *temp = a;
    a = b;
    b = temp;

    printf("%d is the value of a and %d is the value of b", *a, *b);
}

int main()
{
    int a = 10;
    int b = 20;

    swap(&a, &b);
}