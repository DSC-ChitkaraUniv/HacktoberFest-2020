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
		while(t>0)
		{
		    int k=sc.nextInt();
		    int c=1;
		    for(int i=1;i<=k;i++)
		    {
		        System.out.print(c+" ");
		        c=c*(k-i)/i;
		    }
		    System.out.println();
		    t--;
		}
	}
}
