// User function Template for Java

class Solution {
    public static boolean checkSubsequenceSum(int n, int[] arr, int k) {
        // code here
        //int n=arr.length;
        Boolean[][] dp=new Boolean[n][k+1];
        return helper(arr,k,n-1,dp);
    }

    public static boolean helper(int[] arr,int k,int i,Boolean[][] dp){
        
        if(k==0) return true;
        if(i<0) return false;
       
        if(dp[i][k] !=null) return dp[i][k];
        
        boolean pick=false;
        if(k-arr[i]>=0)
            pick=helper(arr,k-arr[i],i-1,dp);
            
        boolean notpick=helper(arr,k,i-1,dp);
        
        return dp[i][k]=pick || notpick;
    }
}
