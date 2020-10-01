'''
    Computes z-array of string s in O(|s|) time.
    Z-array, at index i, stores the length of the longest substring of s
    that starts on i-th place and is also a prefix of s
'''

#########################################################################

def z_array(s):
    z = [len(s)] + [0 for _ in range(len(s) - 1)]

    left, right = 0, 0 # stores the box boundaries
    for k in range(1, len(s)):
        if k > right: # compute naively
            cnt = 0
            while cnt + k < len(s) and s[cnt] == s[cnt + k]:
                cnt += 1
            z[k] = cnt
            if cnt > 0:
                left, right = k, cnt + k - 1
        else: # we are inside the box
            p = k - left # corresponding index in a prefix
            right_part_length = right - k + 1
            if z[p] < right_part_length: # use the past results
                z[k] = z[p]
            else: # compute naively
                i = right + 1
                while i < len(s) and s[i] == s[i - k]:
                    i += 1
                z[k] = i - k
                left, right = k, i - 1
    return z
