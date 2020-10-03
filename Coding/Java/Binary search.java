import java.util.*; 
class BinarySearch
{
    public static void main(String[] args)
    {
        Scanner myobj=new Scanner(System.in);
        int n=myobj.nextInt();
        int ele=myobj.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=myobj.nextInt();
        }
        myobj.close();

        Arrays.sort(a);
        int lb=0;
        int ub=n-1;
        int mid=(ub+lb)/2;
        while(lb<=ub)
        {
            if(a[mid]==ele)
            {
                System.out.printf("%d",mid);
                break;
            }
            else if(ele<a[mid])
            {
                ub=mid-1;
            }
            else if(ele>a[mid])
            {
                lb=mid+1;
            }
            mid=(ub+lb)/2;
        }
    }
}
