class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int k=(int)Arrays.stream(nums).distinct().count();
        Map<Integer,Integer> freq=new HashMap<>();
        int l=0;
        //int r=0;
        int res=0;
        int n=nums.length;
        for(int r=0;r<n;r++){
            freq.merge(nums[r],1,Integer::sum);
            while(freq.size()==k){
                res+=n-r;
                freq.put(nums[l],freq.get(nums[l])-1);
                if(freq.get(nums[l])==0){
                    freq.remove(nums[l]);
                }
                l++;
            }
        }
        return res;
    }
}