import random

secretnumber = random.randint(1,20)
print('I am choosing a number!!!')

for i in range(1,4):
    print('Try to guess number')
    guess = int(input('enter a number between 1 to 20: '))

    if guess < secretnumber:
        print('selected number is too small')

    elif guess > secretnumber:
        print('selected number is too large)
    else:
        break
    
if guess == secretnumber:
    print('congo right guess')
else:
    print(str(secretnumber))
    
  
                    
