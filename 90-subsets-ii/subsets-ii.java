class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        Arrays.sort(nums);
        helper(ans,curr,0,nums);
        return ans;
    }
    public void helper(List<List<Integer>> ans,List<Integer> curr,int pos,int[] arr){

        ans.add(new ArrayList<>(curr));

        for(int i=pos;i<arr.length;i++){
            if(i>pos && arr[i] == arr[i-1]) continue;
            curr.add(arr[i]);
            helper(ans,curr,i+1,arr);
            curr.remove(curr.size()-1);
        }

    }
    
}