'''
    Finds k-th smallest element in the array arr.

'''

#########################################################################

from random import randrange

def find_kth(arr, k, start=0, end=None):
    if not end:
        end = len(arr) -1
    pivot_ridx = randrange(start, end)
    pivot = arr[pivot_ridx]
    pivot_idx = _partition(arr, start, end, pivot_ridx)
    if pivot_idx + 1 == k:
        return pivot
    elif pivot_idx + 1 > k:
        return find_kth(arr, k, start, pivot_idx)
    else:
        return find_kth(arr, k, pivot_idx, end)

def _partition(arr, start, end, pivot_idx):
    pivot = arr[pivot_idx]
    arr[end], arr[pivot_idx] = arr[pivot_idx], arr[end]
    inc_idx = start
    for i in range(start, end):
        if arr[i] <= pivot:
            arr[inc_idx], arr[i] = arr[i], arr[inc_idx]
            inc_idx += 1
    arr[end], arr[inc_idx] = arr[inc_idx], arr[end]
    return inc_idx


#########################################################################

