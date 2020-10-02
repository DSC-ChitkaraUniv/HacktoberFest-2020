import java.util.*;
public class Main 
{
    public static void main(String[] args)
{
    Scanner myobj=new Scanner(System.in);
    int n=myobj.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=myobj.nextInt();
    }
    int temp=0;
    boolean swapped;
    for(int i=0;i<n-1;i++)
    {
        swapped=false;
      for(int j=0;j<n-i-1;j++)
      {
          if(a[j]>a[j+1])
          {
              temp=a[j];
              a[j]=a[j+1];
              a[j+1]=temp;
              swapped=true;
          }
      }
      if(swapped==false)
      {
          break;
      }
    }
    for(int i=0;i<a.length;i++)
    {
        System.out.printf("%d ",a[i]);
    }
}
}    
