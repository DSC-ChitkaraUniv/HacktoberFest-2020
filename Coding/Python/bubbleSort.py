# bubble sorting a list

a=[int(x) for x in input().split()] #line seperated input of list using list comprehension

n=len(a)

for i in range(n):
  for j in range(n-1-i):
    if a[j]>a[j+1]:
      a[j],a[j+1]=a[j+1],a[j]
print(a)
