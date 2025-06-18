// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        //ans.add(0);
        Arrays.sort(arr);
        helper(arr,ans,0,0);
        return ans;
    }
    public void helper(int[] arr,ArrayList<Integer> ans,int idx,int sum){
      
      if(idx == arr.length){
          ans.add(sum);
          return;
      }
      
      helper(arr,ans,idx+1,sum+arr[idx]);
      helper(arr,ans,idx+1,sum);
    }
}