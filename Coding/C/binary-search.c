/* 
  Binary search is a search algorithm which returns the searched term in O(log(n)) complexity
  Binary search requires a sorted array to work with

  How it works?
  Ans - Assuming the array is sorted, the algorithm takes two extreme points of the array i.e the lowest point and the highest point. Initially we take the first index and the last index of array.
  Then it takes the mid point of the range and compares it to required query, if the query is greater than the mid point then the mid point becomes the lowest point
  and if the query is less than the mid point then it becomes highest point, then it repeats the previous steps.
  If the number you searched for isn't in the arrary, then the loop will cause the lowest point to be greater than highest and if it does that we know that there is no such number in array.
*/

//  The following code is compiled using gcc compiler

#include <stdio.h>
#include <stdlib.h>

int binary_search(int *arr, int len, int key)
{
  int low, mid, high;
  low = 0;
  high = len - 1;
  while (low <= high)
  {
    mid = (low + high) / 2;
    if (key == arr[mid])
      return mid; // Returning the number when found
    else if (key < arr[mid])
      high = mid - 1;
    else
      low = mid + 1;
  }

  return -1;
  // If -1 is returned it means the number searched don't exist, assuming the array contains positive numbers, if the test cases contains contain arr with negative number, make sure to change it
}

int main()
{
  int n, key;
  printf("Enter number of elements in array: ");
  scanf("%d", &n);
  int *arr;
  arr = (int *)malloc(sizeof(int) * n);
  printf("Enter the elements of arr\n");
  for (int i = 0; i < n; i++)
  {
    scanf("%d", &arr[i]);
  }
  printf("Enter number you wanna search ");
  scanf("%d", &key);
  int searched_term = binary_search(arr, n, key);
  if (searched_term == -1)
  {
    printf("Number not found\n");
  }
  else
  {
    printf("Number you searched is on index %d\n", searched_term);
  }
}