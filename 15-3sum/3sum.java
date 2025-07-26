class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            ///sum+=nums[i];
            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1]) continue;

            int j=i+1;
            int k=nums.length-1;
            
            while(j<k){
                sum=nums[j]+nums[k]+nums[i];
                if(sum == 0) {
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
                else if(sum>0) k--;
                else j++;
            }
        }
        return new ArrayList<>(ans);
    }
}