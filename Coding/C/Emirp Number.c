//Emirp Number
/*An Emirp Number (prime when spelled backwards) is a number that results
in a prime number when its digits are reversed.

what this code do?
It is a Program to input a number and create function to check whether
it is an Emirp Number or not. Parameter of function should be pointer 
to that number.*/
#include <stdio.h>
int prime(int *num)
{
int r,sum=0,count=0,i;
while((*num)>0)
{
  r=*num%10;
  sum=sum*10+r;
  *num=*num/10;
}
for(i=1;i<=sum;i++)
{
  if(sum%i==0)
    count++;
}
 if(count==2)
 {
   printf("Reverse number is %d\n",sum);
 
 return 1;}
else
  printf("Reverse number is %d\n",sum);
 
 return 0;}
int main()
{
    int x;
    scanf("%d",&x);
    if(prime(&x))
    {
        printf("Emirp Number\n");
    }
    else
    {
        printf("Not an Emirp Number\n");
    }
    return 0;
}