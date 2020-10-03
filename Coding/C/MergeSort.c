#include <stdio.h>
void merge(int *ar, int left,int right, int mid)
{
    int n1,n2,i,j,k;
    n1=mid-left+2;
    n2=right-mid+1;
    int l[n1],r[n2];
    for(i=0;i<n1-1;i++)
    {
        l[i]=ar[left+i];
    }
    for(i=0;i<n2-1;i++)
    {
        r[i]=ar[mid+1+i];
    }
    l[n1-1]=9999;
    r[n2-1]=9999;
    i=0;
    j=0;
    for(k=left;k<=right;k++)
    {
        if(l[i]<r[j])
        {
            ar[k]=l[i];
            i++;
        }
        else
        {
            ar[k]=r[j];
            j++;
        }
    }
}
void mergesort(int *ar,int left,int right)
{
    int i,j,mid;
    if(left<right)
    {
        mid=(left+right)/2;
        mergesort(ar,left,mid);
        mergesort(ar,mid+1,right);
        merge(ar,left,right,mid);
    }
}
int main()
{
int n,i,j;
scanf("%d",&n);
int ar[n];
for(i=0;i<n;i++)
{
    scanf("%d",&ar[i]);
}
mergesort(ar,0,n-1);
for(i=0;i<n;i++)
{
    printf("%d ",ar[i]);
}
    return 0;
}

