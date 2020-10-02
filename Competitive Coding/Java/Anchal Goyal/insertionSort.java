import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class insertionSort
{
    static void insertionSort(int a[],int n)
    {
        int i,j=0,ele;
     for(i=1;i<n;i++)
     {
         ele=a[i];
         for(j=i-1;j>=0;j--)
        {
            if(ele<a[j])
            {
                a[j+1]=a[j];
            }
            else
            {
                break;
            }
        }
        a[j+1]=ele;
    }
    }

    public static void main(String[] args)
    {
        // Write your code here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        insertionSort(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    }
