class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] vis=new boolean[nums.length];
        helper(new ArrayList<>(),vis,nums,ans);
        return ans;
    }
    public void helper(List<Integer> list,boolean[] vis,int[] nums,List<List<Integer>> ans){

        if(list.size() == nums.length) ans.add(new ArrayList<>(list));
        for(int i=0;i<nums.length;i++){
            if(!vis[i]){
                vis[i]=true;
                list.add(nums[i]);
                helper(list,vis,nums,ans);
                list.remove(list.size()-1);
                vis[i]= !vis[i];
            }
        }
    }
}