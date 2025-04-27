class Solution {
    public int countSubarrays(int[] nums) {
        int ans=0;
        // int l=0;
        // int tot=0;
        for(int r=0;r<=nums.length-3;r++){
            if((nums[r]+nums[r+2])*2==nums[r+1]){
                ans++;
            }
        }
        return ans;
    }
}