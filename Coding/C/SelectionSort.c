#include <stdio.h>
int find(int *ar,int left,int right)
{
    int index=left,j,min=ar[left];;
    for (j = left+1; j <=right; j++)   
      if (ar[j] < ar[index])
        index = j;
    
    return index;
}
void swap(int *a,int *b)
{
    int temp=*a;
    *a=*b;
    *b=temp;
}
void selection_sort(int *ar,int size)
{
    int p,s,pos;
    for(p=0;p<size-1;p++)
    {
            pos=find(ar,p,size-1);
            swap(&ar[pos],&ar[p]);
        
    }
}
int main()
{
int size,i;
scanf("%d",&size);
int ar[size];
for(i=0;i<size;i++)
scanf("%d",&ar[i]);
selection_sort(ar,size);
for(i=0;i<size;i++)
printf("%d ",ar[i]);
    return 0;
}

