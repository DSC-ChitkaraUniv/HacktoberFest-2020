#include<stdio.h>
int main()
{
    int i, j, temp, n, a[50];
    printf("Enter no. of Elements: ");
    scanf("%d",&n);
    printf("Enter Array\n");
    for(i=0 ; i<n ; i++)
        scanf("%d",&a[i]);
    for(i=0 ; i<n-1 ; i++)
    {
        for(j=0 ; j<n-i-1 ; j++)
        {
            if(a[j+1] < a[j])
            {
                temp = a[j+1];
                a[j+1] = a[j];
                a[j] = temp;
            }
        }
    }
    printf("Sorted Array:\n");
    for(i=0 ; i<n ; i++)
        printf("%d\n",a[i]);
    return 0;
}
