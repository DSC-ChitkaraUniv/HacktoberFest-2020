def remdup(l):
    l=list(dict.fromkeys(l))
    return l  

def sumsquare(l):
    odd=0
    even=0
    for i in range(len(l)):
        if(l[i]%2==0):
            even+=l[i]**2
        else:
            odd+=l[i]**2
    return[odd,even]  

def  transpose(m):
    c=0
    k=[[0 for i in range(len(m))] for j in range(len(m[c]))]
    for i in range(len(m)):
        for j in range(len(m[c])):
            k[j][i]=m[i][j]
            
            
    return k;     