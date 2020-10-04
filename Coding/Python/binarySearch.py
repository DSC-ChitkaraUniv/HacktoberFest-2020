def binarySearch(arr, x) :
        left=0
        right=len(arr)-1
        mid=int((left+right)//2)

        while left<=right:
          mid=(left+right)//2
          if arr[mid]==x:
            return mid
          elif x>arr[mid]:
            left=mid+1 
          else:
            right=mid-1
           
        return -1
print("Enter The Element In The List")
arr=[int(x) for x in input().split()]
arr.sort()
x=int(input("Enter The Element Need To Find In The List "))
index=binarySearch(arr, x)
if index!=-1:
  print(arr)
  print("The Index Of The Entered Element is ",index)
else:
  print(arr)
  print("There Is No Such Element Present In The List")
