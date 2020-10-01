'''
Count sort. 
Outperforms the default sorting routine when the range of values is reasonably bounded.
'''

def count_sort(a):
    mn, mx = float('inf'), -float('inf')
    for x in a:
        if x < mn: mn = x
        if x > mx: mx = x
    counter = [0 for _ in range(mx - mn + 1)]
    for x in a:
        counter[x - mn] += 1
    j = 0
    for i in range(mx - mn + 1):
        a[j:j+counter[i]] = [i + mn]*counter[i]
        j += counter[i]
