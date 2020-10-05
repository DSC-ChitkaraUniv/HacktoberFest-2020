import time

def random_number(minimum,maximum):
    now = str(time.clock())
    rnd = float(now[::-1][:3:])/1000
    return minimum + rnd*(maximum-minimum)

print("Enter Minimum value")
min=int(input())
print("Enter Maximum value")
max=int(input())
print("Generated Random value is -")
print(random_number(min,max))
