#include<stdio.h>
int linear_rec(int a[], int l, int size, int x)
{
    if(l >= size)
        return -1;
    if(a[l] == x)
        return l;
    return linear_rec(a, l+1, size, x);
}
int main()
{
    int a[50], size, loc, x, l=0;
    scanf("%d",&size);
    for(int i=0 ; i<size ; i++)
        scanf("%d",&a[i]);
    printf("Enter the element to be searched\n");
    scanf("%d",&x);
    loc = linear_rec(a, l, size, x);
    if(loc != -1)
        printf("Element found at location : %d",loc);
    else
        printf("Element not present in the array.");
    return 0;
}
