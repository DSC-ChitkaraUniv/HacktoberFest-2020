class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        seen = set()
        higher_unique_number = set()

        for num in nums:
            if num - k in seen:
                higher_unique_number.add(num)

            if num + k in seen:
                higher_unique_number.add(num+k)

            seen.add(num)

        return len(higher_unique_number)
