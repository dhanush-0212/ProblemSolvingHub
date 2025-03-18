class Solution {
    public void moveZeroes(int[] nums) {
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[pos++]=nums[i];
            }
        }
        for(int i=pos;i<nums.length;i++){
            nums[i]=0;
        }
    }
    // public void rotate(int[] nums,int i){
    //     int temp=nums[i];

    //     for(int pos=i;pos<nums.length-1;pos++){
    //         nums[pos]=nums[pos+1];
    //     }
    //     nums[nums.length-1]=temp;
    // }
}