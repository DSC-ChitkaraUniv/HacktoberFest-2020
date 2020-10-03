class Solution {
    public int trap(int[] height) {
     
        int ans=0;
        for(int i=1;i<height.length-1;i++)
        {
            int maxltt=0;
            int maxrtt=0;
            
            for(int j=i;j>=0;j--)
            {
                maxltt=Math.max(maxltt,height[j]);
            }
            for(int j=i;j<height.length;j++)
            {
                maxrtt=Math.max(maxrtt,height[j]);
            }
            
            ans=ans+(Math.min(maxltt,maxrtt)-height[i]);
        }
        
        return ans;
    }
}
