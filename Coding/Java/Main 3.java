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
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int[] freq=new int[10];
		while(t!=0)
		{
		    int num=sc.nextInt();
		    if(num<100)
		    {
		        System.out.println("Number should be atleast three digits");
		        
		    }
		    else{
		    String val=""+num+num*2+num*3;
		    int flag=1;
		    for(int i=0;i<val.length();i++)
		    {
		        flag=1;
		        int digit=val.charAt(i)-'0';
		        if(freq[digit]>0)
		        {
		           flag=0;
		        }
		        else
		        freq[digit]++;
		    }
		    for(int i=1;i<freq.length;i++)
		    {
		        if(freq[i]==0)
		        {
		           flag=0;
		        }
		    }
		    if(flag==0)
		    System.out.println("Not Fascinating");
		    else
		    System.out.println("Fascinating");
		    
		}
		t--;
	}
	}
}
