class Solution {
    public int majorityElement(int[] nums) {
        int canditate=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==canditate){
                count++;
            }
            else {
                count--;
            }
            if(count== 0){
                canditate=nums[i];
                count=1;
            }
        }
        return canditate;
    }
}