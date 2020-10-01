#include<stdio.h>
void sel_sort(int a[], int n)
{
    int i, j, min, temp;
    for(i=0 ; i<n-1 ; i++)
    {
        min = i;
        for(j=i+1 ; j<n ; j++)
        {
            if(a[j] < a[min])
                min = j;
        }
        temp = a[min];
        a[min] = a[i];
        a[i] = temp;
    }
}
int main()
{
    int a[50], b[50], n;
    printf("Enter no. of elements: ");
    scanf("%d",&n);
    printf("Enter Array:\n");
    for(int i=0 ; i<n ; i++)
        scanf("%d",&a[i]);
    sel_sort(a, n);
    for(int i=0 ; i<n ; i++)
        printf("%d\n",a[i]);
}
