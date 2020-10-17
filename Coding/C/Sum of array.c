#include <stdio.h>
int main() {
    int i,num,sum=0;
    scanf("%d",&num);
    int array[num];
    for(i=0;i<num;i++)
    {
        scanf("%d ",&array[i]);
        sum+=array[i];
    }
    
    printf("Sum of array is %d",sum);
}
