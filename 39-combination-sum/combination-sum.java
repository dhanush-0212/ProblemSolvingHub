class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(candidates,target,0,ans,new ArrayList<Integer>());
        return ans;
    }
    public void helper(int[] arr,int target,int idx, List<List<Integer>> ans, List<Integer> ds){
        if(idx == arr.length){
            if(target == 0) ans.add(new ArrayList<>(ds));
            return;
        }


        if(arr[idx]<=target){
            ds.add(arr[idx]);
            helper(arr,target-arr[idx],idx,ans,ds);
            ds.remove(ds.size()-1);
        }
        helper(arr,target,idx+1,ans,ds);
    }
}