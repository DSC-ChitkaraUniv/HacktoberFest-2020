#include<stdio.h>
int binary(int a[], int l, int u, int x)
{
    while(l<=u)
    {
        int mid = (l+u)/2;
        if(a[mid] == x)
            return mid;
        else if(a[mid] < x)
            l = mid+1;
        else l = mid-1;
    }
    return -1;
}
int main()
{
    int a[50], size, loc, x, l=0;
    scanf("%d",&size);
    for(int i=0 ; i<size ; i++)
        scanf("%d",&a[i]);
    printf("Enter the element to be searched\n");
    scanf("%d",&x);
    loc = binary(a, l, size-1, x);
    if(loc != -1)
        printf("Element found at location : %d",loc);
    else
        printf("Element not present in the array.");
    return 0;
}
