class Solution:
    def bitwiseComplement(self, N: int) -> int:

        if N == 0: 
            return 1


        temp = N
        bit = 1

        while temp:
            N = N ^ bit 
            bit = bit << 1 
            temp = temp >> 1
        return N
