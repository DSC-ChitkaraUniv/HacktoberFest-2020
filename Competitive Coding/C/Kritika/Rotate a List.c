#include <stdio.h>
/* Include other headers as needed */
int main()
{
 int a,b,c,d[20],e,i,t;
  scanf("%d",&a);
  
   for(b=0;b<a;b++)
   {
     scanf("%d",&c);
        for(i=0;i<c;i++)
          {
            scanf("%d",&d[i]);
          }
     scanf("%d",&e);
        for(;e>0;e--)
          {
            t=d[0];
              for(i=0;i<c-1;i++)
                {
                 d[i]=d[i+1];
                } 
             d[c-1]=t;
           }
          for(i=0;i<c;i++)
           {
             if(i<c-1)
             {
              printf("%d ",d[i]);
             }
              else
             {
              printf("%d",d[i]);
             }
           
           } 
      printf("\n");
   }
  
  
  
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    return 0;
}
