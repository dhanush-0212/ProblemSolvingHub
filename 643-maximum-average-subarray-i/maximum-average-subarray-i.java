class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=0;
        for(int i=0;i<k;i++){
            ans+=nums[i];
        }
        int j=0;
        double max=ans/k;
        for(int i=k;i<nums.length;i++){
            ans-=nums[j++];
            ans+=nums[i];
            max=Math.max(ans/k,max);
        }
        return max;
    }
}