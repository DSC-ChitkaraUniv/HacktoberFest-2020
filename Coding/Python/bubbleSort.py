# bubble sorting a list

def bubbleSort(a): # a is the list to sort
  n=len(a) # n is the length of the list
  for i in range(n-1):
    for j in range(n-1-i): # after one complete pass the largest number is moved to n-1-i th index by consequtive comparisions and swaps
      if a[j]>a[j+1]:
        a[j],a[j+1]=a[j+1],a[j]
  return(a)

def displayList(a): # prints the list
  for ele in a:
    print(ele,end=" ")
  print()

# lenght of list is not being taken as input becuase it is not required
num=int(input("Enter Number of Lists to Sort:"))
q=0
while q<num: 
  print(q+1,"List")
  a=[int(x) for x in input().split()] #space seperated input of list using list comprehension
  bubbleSort(a)
  displayList(a)
  q+=1
  print()
