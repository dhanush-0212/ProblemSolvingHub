class Solution {
    public boolean search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            if(nums[mid]==target){
                return true;
            }
            if(nums[mid]==nums[start] && nums[mid]==nums[end]){
                    start++;
                    end--;
                    continue;
            }
            if(nums[start]<=nums[mid]){
                if(target<=nums[mid]&& target>=nums[start]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target>=nums[mid]&& target <=nums[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return false;
    }
}