row=int(input("Enter the limit:"))
#top half
k=0
for i in range(1,row+1):
    for j in range(1,(row-i)+1):
        print(end=" ")

    while k!=(2*i-1):
        print("*",end="")
        k=k+1
    k=0
    #add a line break
    print()

#bottom half
m=1
for i in range(1,row):
    for j in range(0,i):
        print(end=" ")
    
    while m<=(2*(row-i)-1):
        print("*",end="")
        m=m+1
    m=1
    print()
