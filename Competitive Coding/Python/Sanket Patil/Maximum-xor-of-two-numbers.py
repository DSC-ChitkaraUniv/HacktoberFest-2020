'''
    Finds maximum XOR of two numbers in an array.
'''



#########################################################################

def maximum_xor(nums):
    answer = 0
    for i in range(31, -1, -1):
        answer <<= 1
        prefixes = {num >> i for num in nums}
        answer += any(answer^1^p in prefixes for p in prefixes)
    return answer
