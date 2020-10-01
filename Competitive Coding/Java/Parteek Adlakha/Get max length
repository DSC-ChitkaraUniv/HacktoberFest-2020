class Solution {
    public int getMaxLen(int[] nums) {
        int ans = 0, l = 0, r = 0, nc = 0, fn = -1, ln = -1;
        
        for(r = 0; r < nums.length; r++) {
            if(nums[r] == 0) {
                if(nc%2 == 0) {
                    ans = Math.max(ans, r - l);
                }
                else {
                    ans = Math.max(ans, Math.max(r - fn - 1, ln - l));
                }
                nc = 0;
                l = r + 1;
                fn = ln = -1;
            }
            if(nums[r] < 0) {
                nc++;
                if(fn == -1) fn = ln = r;
                else ln = r;
            }
        }
        if(nc%2 == 0) {
            ans = Math.max(ans, r - l);
        }
        else {
            ans = Math.max(ans, Math.max(r - fn - 1, ln - l));
        }
        return ans;
    }
}
