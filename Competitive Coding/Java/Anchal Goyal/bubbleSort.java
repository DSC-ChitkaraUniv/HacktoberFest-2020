import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class bubbleSort
{
    static void bubbleSort(int arr[],int n)
    {
int temp;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
             {
                if(arr[j]>arr[j+1])
                {
                  temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                }
             }
        }
    }
   
    public static void main(String[] args)
    {
        // Write your code here
        Scanner s=new Scanner(System.in);
        System.out.print("enter no of elements");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        bubbleSort(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    }