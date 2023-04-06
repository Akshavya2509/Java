#include<stdio.h>

int main()
{
    int n;

    scanf("%d", &n);

    char c[n][10];

    for(int j = 0; j < n ; j ++)
    {
       scanf("%s", &c[j][0]);
    }
    

    for(int i = 0; i < n; i ++)
    {
        printf("%s ", c[i]);
    }

    /*

    B|h|a|v|y|a \0
    S t u d i e s \0

    n = 4
    
    */
}