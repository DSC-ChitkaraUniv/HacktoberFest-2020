def isertionSort(arr):
  for i in range(1,len(arr)):
    j=i-1
    temp=arr[i]
    while j>=0 and arr[j]>temp:
      arr[j+1]=arr[j]
      j-=1

    arr[j+1]=temp

print("Enter The Element Of The List Seprated By Space")
arr=[int(x) for x in input().split()]
isertionSort(arr)
print("Sorted List - ",arr)
