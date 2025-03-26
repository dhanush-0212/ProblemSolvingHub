class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0,ans=Integer.MIN_VALUE;
        for(int num:gain){
            sum+=num;
            ans=Math.max(ans,sum);
        }
        return ans<0?0:ans;
    }
}