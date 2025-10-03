class Solution {
    public boolean canPartition(int[] nums) {
        int totSum=0;
        for(int num:nums) totSum+=num;
        if(totSum %2 !=0) return false;
        int target=totSum/2;
        return helper(nums,target,nums.length);
    }
    public boolean helper(int[] arr,int k,int n){
        boolean[] prev=new boolean[k+1];
        
        prev[0]=true;
       
        //for(int i=0;i<n;i++) dp[i][0]=true;
        
        if(arr[0] <= k) prev[arr[0]]=true;
        
        for(int i=1;i<n;i++){
            boolean[] curr=new boolean[k+1];
             curr[0]=true;
            for(int target=1;target<=k;target++){
                
                boolean notpick=prev[target];
                boolean pick=false;
                if(arr[i]<=target)
                    pick=prev[target-arr[i]];
            
                curr[target] = pick || notpick;
            }
            prev=curr;
        }
        return prev[k];
    }
}