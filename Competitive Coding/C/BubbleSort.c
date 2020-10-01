#include <stdio.h>
void swap(int *a,int *b)
{
    int temp=*a;
    *a=*b;
    *b=temp;
}
int bubble_sort(int *ar,int n)
{
    int p,c,flag=0,comp=0;
    for(p=1;p<=n-1;p++)
    {
        flag=0;
        for(c=1;c<=n-p;c++)
        {
            if(ar[c-1]>ar[c])
            {
               swap(&ar[c-1],&ar[c]);
               
               flag=1;
            }
            comp++;
        }
        if(flag==0)
        break;
    }
    return comp;
}
int main()
{
int size,i;
scanf("%d",&size);
int ar[size];
for(i=0;i<size;i++)
{
    scanf("%d",&ar[i]);
}
int comp=bubble_sort(ar,size);
printf("%d\n",comp);
for(i=0;i<size;i++)
{
    printf("%d ",ar[i]);
}
    return 0;
}
#include <stdio.h>
void swap(int *a,int *b)
{
    int temp=*a;
    *a=*b;
    *b=temp;
}
int bubble_sort(int *ar,int n)
{
     int p,c,flag=0,comp=0;
    for(p=1;p<=n-1;p++)
    {
        for(c=1;c<=n-p;c++)
        {
            if(ar[c-1]>ar[c])
            {
               swap(&ar[c-1],&ar[c]);
               
            }
            comp++;
        }
    }
    return comp;
}

int main()
{
    int size,i;
scanf("%d",&size);
int ar[size];
for(i=0;i<size;i++)
{
    scanf("%d",&ar[i]);
}
int comp=bubble_sort(ar,size);
printf("%d\n",comp);
for(i=0;i<size;i++)
{
    printf("%d ",ar[i]);
}

    return 0;
}

