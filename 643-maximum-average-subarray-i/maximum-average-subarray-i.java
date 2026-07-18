class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxWindow=Integer.MIN_VALUE;
        double ans=0;
        for(int i=0;i<k;i++){
            ans+=nums[i];
        }
        maxWindow=Math.max(ans/k,maxWindow);
        //System.out.println(maxWindow);
        for(int i=k;i<nums.length;i++){
            ans-=nums[i-k];
            ans+=nums[i];
            //System.out.println(ans/k);
            maxWindow=Math.max(ans/k,maxWindow);
            //System.out.println(maxWindow);
        }
        return maxWindow;
    }
}