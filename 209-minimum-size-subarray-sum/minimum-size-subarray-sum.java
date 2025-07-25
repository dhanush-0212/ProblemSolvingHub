class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int len=Integer.MAX_VALUE;
        int sum=0;
        for(int r=0;r<nums.length;r++){
            
            sum+=nums[r];
            while(sum>=target){
                len=Math.min(len,r-l+1);
                sum-=nums[l];
                l++;
                //maxsum=Math.max(maxsum,r-l+1);
                
            }
            
            
        }
        return len==Integer.MAX_VALUE? 0 : len;
    }
}