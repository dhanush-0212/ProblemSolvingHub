class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        
        return helper(arr,0,sum,arr.length-1,new boolean[arr.length]);
    }
    public static boolean helper(int[] arr,int sum,int target,int i,boolean[] dp){
        
        if(sum == target) return true;
        if(sum > target || i<0 ) return false;
        if(dp[i]) return dp[i];
        boolean left=helper(arr,sum+arr[i],target,i-1,dp);
        boolean right=helper(arr,sum,target,i-1,dp);
    
        return dp[i]=left || right;
    }
}