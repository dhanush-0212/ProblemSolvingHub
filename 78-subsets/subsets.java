class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> sol=new ArrayList<>();
        helper(nums,list,sol,0);
        return list;
    }
    public void helper(int[] nums,List<List<Integer>> list,List<Integer> sol,int start){
        list.add(new ArrayList<>(sol));
        for(int i=start;i<nums.length;i++){
            sol.add(nums[i]);
            helper(nums,list,sol,i+1);
            sol.remove(sol.size()-1);
        }
    }
}