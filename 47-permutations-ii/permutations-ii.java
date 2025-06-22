class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        Arrays.sort(nums);
        helper(nums,0,ans,temp,visited);
        return ans;
    }
    public void helper(int[] nums,int idx,List<List<Integer>> ans,List<Integer> temp,boolean[] visited){

        if(temp.size()==nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }


        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]== nums[i-1] && !visited[i-1]) continue;

           if(visited[i]) continue;

            visited[i]=true;
            temp.add(nums[i]);

            helper(nums,i+1,ans,temp,visited);

            temp.remove(temp.size()-1);
            visited[i]=false;

        }
    }
}