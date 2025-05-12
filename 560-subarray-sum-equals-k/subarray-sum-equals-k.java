class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> sum=new HashMap<>();
        sum.put(0,1);
        int s=0;
        int val=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            
            if(sum.containsKey(s-k)){
                val+=sum.get(s-k);
            }
            sum.put(s,sum.getOrDefault(s,0)+1);
        }
        return val;
    }
}