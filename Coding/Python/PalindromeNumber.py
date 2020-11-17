import math

# reversing the number
def rev(num):
    return int(num != 0) and ((num % 10) * \
             (10 ** int(math.log(num, 10))) + \
                              rev(num // 10))

# getting input
print("Enter the Number to be Checked : ")
number = int(input())

# checking whether reversed number = input number
res = number == rev(number)

# printing result
if res:
    print("The number is Palindrome !")
elif not res:
    print('The number is Not Palindrome !')
