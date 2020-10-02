def SieveOfEratosthenes(num): 
      
    primeList = [True for i in range(num+1)] 
    k = 2
    while(k*k<=num): 
        if(primeList[k] == True): 
            for i in range(k*2, num+1, k): 
                primeList[i] = False
        k += 1
    primeList[0]=False
    primeList[1]=False
    for k in range(num+1): 
        if primeList[k]: 
            print(k) 
  
if __name__=='__main__': 
    num = int(input("Enter the number: "))
    print("The prime numbers are:")
    SieveOfEratosthenes(num)