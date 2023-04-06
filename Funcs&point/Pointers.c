#include<stdio.h>

int add(int *p, int a) // int *p = c or &b;
{
    return a*(*p); // a*b;
}

int add1(int **p, int *q, int b)
{
    return b *** p ** q;
}

int main()
{
/*  
    int a = 10;

    int b = 2 * a;

    int d = 3 * b;

    int * p = &d;

    printf("%d",add1(&p, &b, a));
*/
    // int *q = &a;

    // printf("%d", *(&q));

    // printf("%d", *q);

    // int **p = &q; // address of pointer q

    //printf("%d", p); // address of q

    //printf("%d", *p); // address of a *p = *(&q)

    //printf("%d", **p);// value of a 

    // int *c = &b;

    // printf("%d", add(c, a));

    // int c = *q; // *(*q)

    // printf("%d", *p);

    int a;

    scanf("%d", &a);

    int b[a];

    for(int i = 0;i < a; i ++)
    {
        scanf("%d", &b[i]);
    }

    for(int i = 0; i < a; i ++)
    {
        printf("%d ", b[i]);
    }
}