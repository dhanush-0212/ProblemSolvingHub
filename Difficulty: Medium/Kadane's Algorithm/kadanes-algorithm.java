class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int maxsum=Integer.MIN_VALUE,currsum=0;
        for(int num:arr){
            currsum+=num;
            if(currsum>maxsum) maxsum=currsum;
            if(currsum<0) currsum=0;
        }
        return maxsum;
    }
}
