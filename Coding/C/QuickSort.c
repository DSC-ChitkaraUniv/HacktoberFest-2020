#include <stdio.h>
void swap(int *a,int *b)
{
    int temp=*a;
    *a=*b;
    *b=temp;
}
int partition(int *ar,int p,int r)
{
    int i=p-1,j=p,x=ar[r];
    while(j<r)
    {
        if(ar[j]>x)
        j++;
        else if(ar[j]<x)
        {
            i++;
            swap(&ar[i],&ar[j]);
            j++;
        }
    }
    swap(&ar[r],&ar[i+1]);
    return i+1;
}
void quicksort(int *ar,int p,int r)
{
    if(p<r)
    {
    int q=partition(ar,p,r);
    quicksort(ar,p,q-1);
    quicksort(ar,q+1,r);
    }
}
int main()
{
int size,i,j;
scanf("%d",&size);
int ar[size];
for(i=0;i<size;i++)
scanf("%d",&ar[i]);
quicksort(ar,0,size-1);
for(i=0;i<size;i++)
printf("%d ",ar[i]);
    return 0;
}

