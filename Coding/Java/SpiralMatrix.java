
/*Spirally traversing a matrix
Traversing an array is an elementary operation on an array, in which each element will be processed 
for some operation. Printing elements is one example operation.

So, complete the below function, which given a two dimensional array, print the array 
in spiral form rotating clockwise.



Input Format

Each test-case will begin with two number m and n where m = no. of rows and
 n = no. of columns. m rows will follow with n integers in each row separated
  by a space. Constraint : 1<=m<=50 and 1<=n<=50.

Output Format

For each test case, print the elements of 2-d array in spiral form starting
 from index (0,0) or upper-left corner in clockwise direction.*/
import java.util.*;
public class SpiralMatrix
{
  public static void main(String[] args)
  {
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
int c=sc.nextInt();
 int arr[][]=new int[r][c];
 for(int i=0;i<r;i++)
 {
	 for(int j=0;j<c;j++)
	 {
		 arr[i][j]=sc.nextInt();
	 }
 }
    int minr=0,minc=0;
    int maxr=r-1,maxc=c-1;
    int tne=r*c;
    int counter=0;
    
    while(counter<tne)
    {
      for(int j=minc;j<maxc+1 && counter<tne;j++)
      {
        System.out.print(arr[minr][j]+" ");
        counter++;
      }
      minr++;
      for(int i=minr;i<maxr+1 && counter<tne;i++)
      {
        System.out.print(arr[i][maxc]+" ");
        counter++;
      }
      maxc--;
      for(int j=maxc;j>minc-1 && counter<tne;j--)
       {
          System.out.print(arr[maxr][j]+" ");
          counter++;
        }
      maxr--;
      }
      for(int i=maxr;i>minr-1 && counter<tne;i--)
      {
          System.out.print(arr[i][minc]+" ");
          counter++;
      }
      minc++;
      }
  }
