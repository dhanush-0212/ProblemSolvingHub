class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(candidates,target,ans,new ArrayList<>(),candidates.length-1);
        return ans;
    }
    public void helper(int[] candidates,int target,List<List<Integer>> ans,List<Integer> list,int idx){
        if(idx<0 || target < 0) return;
        if(target==0) {ans.add(new ArrayList<>(list)); return;}
        
        
        list.add(candidates[idx]);
        helper(candidates,target-candidates[idx],ans,list,idx);
        list.remove(list.size()-1);
        helper(candidates,target,ans,list,idx-1);
    }
}