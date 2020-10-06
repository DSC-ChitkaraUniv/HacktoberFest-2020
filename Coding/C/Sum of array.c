#include <stdio.h>
int main() {
    int ct,num,sum=0;
    scanf("%d",&num);
    int array[num];
    for(ct=0;ct<num;ct++)
    {
        scanf("%d ",&array[ct]);
        sum+=array[ct];
    }
    
    printf("Sum of the given array is %d",sum);
}
