#include <stdio.h>
#include <stdlib.h>
int main()
{
    int n, *ptr;

    scanf("%d", &n);

    ptr = (int *)malloc(n * sizeof(int)); // memory allocated using malloc

    if (ptr == NULL)
    {
        printf("Sorry! unable to allocate memory");
        exit(0);
    }

    for (i = 0; i < n; ++i)
    {
        scanf("%d", ptr + i);
    }
    
    free(ptr); // Freeing memory

    return 0;
}