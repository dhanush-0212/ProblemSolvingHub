class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        helper(ans,0,0,n,sb);
        return ans;
    }
    public void helper(List<String> ans,int open,int close,int n,StringBuilder sb){

        if(open==n && close==n){
            ans.add(sb.toString());
            return;
        }

        if(open<n){
            sb.append('(');
            helper(ans,open+1,close,n,sb);
            sb.delete(sb.length()-1,sb.length());
        }
        if(close<open){
            sb.append(')');
            helper(ans,open,close+1,n,sb);
            sb.delete(sb.length()-1,sb.length());
        }
    }
}