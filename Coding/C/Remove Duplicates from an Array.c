void removeDuplicates(int *arr, int *size)
{
  int a[*size],i,j=0;
  for(i=0;i<*size;i++)
  {
    if(arr[i]!=arr[i+1])
    {
    a[j]=arr[i];
      j++;
    }
  }
  a[j]=a[*size-1];
  *size=j;
  for(i=0;i<*size;i++)
  {
    arr[i]=a[i];
  }
}
  
  
  
