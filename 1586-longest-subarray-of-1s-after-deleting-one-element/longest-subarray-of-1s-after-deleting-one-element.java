class Solution {
    public int longestSubarray(int[] nums) {
        int zero=0,ans=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){ zero+=1;}
            while(zero>1){
                if(nums[l]==0){zero-=1;}
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans-1;
    }
}