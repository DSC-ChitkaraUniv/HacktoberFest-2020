import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class quickSort
{
    public static int partition(int a[],int start,int end)
    {
      int pivot=end;
      int i,j=end,count=0;
      for(i=0;i<=end;i++)
      {
        if(a[i]<=a[pivot])
        {
            count++;
        }
      }
     int temp=a[count-1];
      a[count-1]=a[pivot];
      a[pivot]=temp;
      pivot=count-1;

    i=0;
    while(i<pivot && j>pivot)
    {
        if(a[i]<=a[pivot])
        {
            i++;
        }
        else if(a[j]>a[pivot])
        {
            j--;
        }
        else
        {
            swap(a,i,j);
            i++;
            j--;
        }
    }
    return pivot;
    }
public static void swap(int a[],int x,int y)
{
    int temp;
    temp=a[x];
    a[x]=a[y];
    a[y]=temp;
}
    public static void sort(int a[],int start,int end)
    {
        if(start<end)
        {
            int x=partition(a,start,end);
            sort(a,start,x-1);
            sort(a,x+1,end);
        }
    }
    public static void main(String[] args)
    {
           // Write your code here
        Scanner s=new Scanner(System.in);
       System.out.print("Enter number of elements");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        sort(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    }