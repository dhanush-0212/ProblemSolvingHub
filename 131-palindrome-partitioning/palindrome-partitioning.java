class Solution {
    public List<List<String>> partition(String s) {
         List<List<String>> ans=new ArrayList<>();
         List<String> temp =new ArrayList<>();
         helper(s,0,ans,temp);
         return ans;
    }

    public void helper(String s,int idx, List<List<String>> ans,List<String> temp){
        
        if(idx==s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=idx;i<s.length();i++){
            if(ispalimdrome(s,idx,i)){
                temp.add(s.substring(idx,i+1));
                helper(s,i+1,ans,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public boolean ispalimdrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
        
}