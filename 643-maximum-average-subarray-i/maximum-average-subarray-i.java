class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=Integer.MIN_VALUE;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        max=Math.max(max,sum/k);
        int l=0;
        for(int r=k;r<nums.length;r++){
            sum-=nums[l++];
            sum+=nums[r];
            max=Math.max(max,sum/k);
        }
        return max;
    }
}