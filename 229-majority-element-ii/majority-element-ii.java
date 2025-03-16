class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> res=new HashMap<>();
        int n=nums.length/3;
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            res.put(num,res.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:res.entrySet()){
            if(entry.getValue()>nums.length/3){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}