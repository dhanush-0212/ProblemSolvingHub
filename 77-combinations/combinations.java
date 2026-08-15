class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(new ArrayList<>(),n,k,1,ans);
        return ans;
    }
    public void helper(List<Integer> list,int n,int k,int pos,List<List<Integer>> ans){

        if(list.size() == k) {ans.add(new ArrayList<>(list)); return;}
        for(int i=pos;i<=n;i++){
            list.add(i);
            helper(list,n,k,i+1,ans);
            list.remove(list.size()-1);
        }
    }
}