import random

def genCaptcha():
  li=[None]*62
  for i in range(26):
    a=random.randint(65,90)
    b=chr(a)
    li[i]=b
  for i in range(26,52):
    a=random.randint(97,122)
    b=chr(a)
    li[i]=b
  for i in range(52,62):
    a=random.randint(0,9)
    li[i]=str(a)
  mi=random.sample(li,8)  
  return mi

def displayCaptcha(mi):
    for i in mi:
      print(i,end="")
    print()

def convertListToString(a):
  m=""
  for i in a:
    m+=i
    
  return m  






START="****************************Program Starting**********************"

      ###### Main Execution Of Program Strats From Here  ##########


import time

a=genCaptcha()
genc=convertListToString(a)
displayCaptcha(a)




while True:
  print()
  print("Enter 1 to Write Captcha")
  print("Enter 2 to Reload Captcha")
  print()
  print("Enter Your Choice ")
  choice=int(input())
  print()
 
  if choice==1:
    print("Write Captcha")
    write=input()
    if write==genc:
      print("Captcha is Correct")
      break
    else:
      print()
      print("Retry Invalid Captcha")
      time.sleep(1)
  
  elif choice==2:
    print("*************NEW CAPTCHA***************")
    newgenc=genCaptcha()
    genc=convertListToString(newgenc)
    displayCaptcha(genc)
