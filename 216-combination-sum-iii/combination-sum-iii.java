class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(k,n,1,ans,temp);
        return ans;
    }

    public void helper(int k,int target,int pos,List<List<Integer>> ans,List<Integer> temp){
        if(k==temp.size()){
            if(target == 0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        if(pos > target) return;
        
        for(int i=pos;i<=9;i++){
            temp.add(i);
            helper(k,target-i,i+1,ans,temp);
            temp.remove(temp.size()-1);
        }

    }
}