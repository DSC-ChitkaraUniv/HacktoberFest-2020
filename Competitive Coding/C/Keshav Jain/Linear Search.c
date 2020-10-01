#include<stdio.h>
int linear(int a[], int size, int x)
{
    for(int i=0 ; i<size ; i++)
        if(a[i] == x)
        return i;

    return -1;
}
int main()
{
    int a[50], size, loc ,x;

    scanf("%d",&size);

    for(int i=0 ; i<size ; i++)
        scanf("%d",&a[i]);

    printf("Enter the element to be searched\n");

    scanf("%d",&x);

    loc = linear(a, size, x);

    if(loc != -1)
        printf("Element found at location : %d",loc);

    else
        printf("Element not present in the array.");

    return 0;
}
