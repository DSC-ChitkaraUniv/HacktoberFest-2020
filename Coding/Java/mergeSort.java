import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class mergeSort
{
    public static void mergeSort(int a[])
    {
        if(a.length>1)
        {
        int mid=a.length/2;
        int i,j;
        int left[]=new int[mid];
        int right[]=new int[a.length-mid];
        for(i=0;i<mid;i++)
        {
            left[i]=a[i];
        }
        for(i=mid,j=0;i<a.length;i++,j++)
        {
            right[j]=a[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,a);
        }
        else
        return;
    }
    public static void merge(int left[],int right[],int a[])
    {
        int i=0,j=0,k=0;
        int l1=left.length;
        int r1=right.length;
        int a1=a.length;
        while(i<l1 && j<r1)
        {
          if(left[i]<right[j])
          {
              a[k]=left[i];
              k++;
              i++;
          }
          else
          {
              a[k]=right[j];
              k++;
              j++;
          }    
        }
        while(i<l1)
        {
            a[k]=left[i];
            k++;
            i++;
        }
        while(j<r1)
        {
            a[k]=right[j];
            j++;
            k++;
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
        mergeSort(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    }