/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    a[i]=sc.nextInt();
		    for(int i=0;i<n;i++)
		    a[i]=a[i]*a[i];
		    Arrays.sort(a);
		    int flag=0;
		    for(int i=n-1;i>=2;i--)
		    {
		        int l=0;
		        int r=i-1;
		         flag=0;
		        while(l<r)
		        {
		            if(a[l]+a[r]==a[i])
		            {
		                flag=1;
		                break;
		            }
		            if(a[l]+a[r]<a[i])
		            l++;
		            else
		            r--;
		        }
		        if(flag==1)
		        {
		            System.out.println("Yes");
		            break;
		        }
		        
		    }
		    if(flag==0)
		    {
		        System.out.println("No");
		    }
		    t--;
		}
	}
}
