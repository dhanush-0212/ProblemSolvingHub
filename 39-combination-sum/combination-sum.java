class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>(); 
        helper(candidates,target,candidates.length-1,list,temp);
        return list;
    }
    public void helper(int[] candidates, int target,int idx,List<List<Integer>> list, List<Integer> temp){
        if(target<0 || idx<0 ) return;
        if(target==0){
            list.add(new ArrayList<>(temp));
            return;
        }
        temp.add(candidates[idx]);
        helper(candidates,target-candidates[idx],idx,list,temp);
        temp.remove(temp.size()-1);
        helper(candidates,target,idx-1,list,temp);
    }
}