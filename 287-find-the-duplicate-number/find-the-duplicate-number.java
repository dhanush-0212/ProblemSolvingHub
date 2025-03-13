class Solution {
    public int findDuplicate(int[] nums) {
        int arr[]=new int[nums.length];
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
           if(arr[i]>1){ans=i; break;}
        }
        return ans;
    }
}