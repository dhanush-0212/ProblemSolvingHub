class Solution {
    public int maxOperations(int[] nums, int k) {
        int l=0,r=nums.length-1;
        int count=0;
        Arrays.sort(nums);
        while(l<r){
            int sum=nums[l]+nums[r];
            if(sum==k){
                count++;
                l++;
                r--;
            }
            else if(sum<k){
                l++;
            }
            else{
                r--;
            }
        }
        return count;
    }
}