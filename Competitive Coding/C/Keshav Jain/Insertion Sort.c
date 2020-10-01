#include<stdio.h>
void ins_sort(int a[], int n)
{
    int i, j, key, temp;
    for(i=1 ; i<n ; i++)
    {
        key = a[i];
        j = i-1;
        while(j>=0 && a[j]>key)
        {
            a[j+1] = a[j];
            j = j-1;
        }
        a[j+1] = key;
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
    ins_sort(a, n);
    for(int i=0 ; i<n ; i++)
        printf("%d\n",a[i]);
}
