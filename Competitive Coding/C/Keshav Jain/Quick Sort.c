#include<stdio.h>
int partition(int a[], int low, int high)
{
    int temp, i, j;
    int pivot = a[high];
    i = low - 1;
    for(j=low ; j<=high-1 ; j++)
    {
        if(a[j]<=pivot)
        {
            i++;
            temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }
    }
    temp = a[high];
    a[high] = a[i+1];
    a[i+1] = temp;
    return (i+1);
}
void quicksort(int a[], int low, int high)
{
    if(low < high)
    {
        int pi = partition(a, low, high);
        quicksort(a, low, pi-1);
        quicksort(a, pi+1, high);
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
    quicksort(a, 0, n-1);
    for(int i=0 ; i<n ; i++)
        printf("%d\n",a[i]);
}
