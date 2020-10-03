# https://leetcode.com/problems/minimum-time-visiting-all-points/


class Solution:
    def minTimeToVisitAllPoints(self, points: List[List[int]]) -> int:
        time = 0
        for i in range(len(points) - 1) :
            x = abs(points[i+1][0] - points[i][0])
            y = abs(points[i+1][1] - points[i][1])
            time += max(x,y)
        
        return time
