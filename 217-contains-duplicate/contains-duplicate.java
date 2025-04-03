class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> list=new HashSet<>();
        for(int val:nums){
            if(list.contains(val)){
                return true;
            }
            list.add(val);
        }
        return false;
    }
}