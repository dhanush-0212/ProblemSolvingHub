class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=0,last_smaller=Integer.MIN_VALUE,cnt=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1 == last_smaller){
                cnt++;
                last_smaller=nums[i];
            }
            else if(nums[i] != last_smaller){
                last_smaller=nums[i];
                cnt=1;
            }
            longest=Math.max(longest,cnt);
        }
        return longest;
    }
}