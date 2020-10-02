import java.util.*;
class heapSort
{
  static void heapSort(int arr[],int n)
    {
      for(int i=n/2-1;i>=0;i--)
      {
       heapify(arr,i,n);
      }
      for(int i=n-1;i>=0;i--)
    {
     int a=arr[0];
     arr[0]=arr[i];
     arr[i]=a;
     heapify(arr,0,i);
    }
    }
  static void heapify(int arr[],int i,int n)
   {
     int large=i;
     int left=2*i+1;
     int right=2*i+2;
     if(left<n && arr[large]<arr[left])
     {
      large=left;
     }
     if(right<n && arr[large]<arr[right])
     {
      large=right;
     }
     if(large!=i)
     {
       int temp=arr[i];
       arr[i]=arr[large];
       arr[large]=temp;
       heapify(arr,large,n);
     }
   }

    public static void main(String[] args)
    {
        // Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        heapSort(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    }