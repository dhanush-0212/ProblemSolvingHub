class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans=new HashSet<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            int l=i+1;
            int r=nums.length-1;

            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1]) continue;

            while(l<r){
                sum=curr+nums[l]+nums[r];

                if(nums[i]>0) break;
                if(i>0 && nums[i]==nums[i-1]) continue;

                if(sum==0){
                    ans.add(new ArrayList<>(Arrays.asList(curr,nums[l],nums[r])));
                    l++;
                    r--; 
                    while(l<r && nums[l] == nums[l-1]) l++;
                    while(l<r && nums[r] == nums[r+1]) r--;
                }
                else if(sum > 0) r--;
                else l++;
            }
        }
        return new ArrayList<>(ans);
    }
}