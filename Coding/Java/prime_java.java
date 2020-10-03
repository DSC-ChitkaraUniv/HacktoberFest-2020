// Java program to find prime numbers in a given range

import java.util.*;
public class Main
{
public static void main(String args[])
{
int a,b,flag,i;
Scanner sc = new Scanner(System.in);
System.out.print(“\nEnter start value : “);
a = sc.nextInt();
System.out.print(“\nEnter end value : “);
b = sc.nextInt();
System.out.print(“\nPrime numbers between “+ a + ” and ” + b + ” are : “);
while (a < b)
{
flag = 0;
for(i = 2; i <= a/2; ++i)
{
if(a % i == 0)
{
flag = 1;
break;
}
}
if (flag == 0)
System.out.print(a + ” “);
++a;
}
}
}
