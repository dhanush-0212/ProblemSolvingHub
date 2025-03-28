class Solution {
    public String removeStars(String s) {
        Stack<Character> stck=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='*') stck.pop();
            else stck.push(c);
        }
        int n=stck.size();
        for(int i=0;i<n;i++){
            sb.append(stck.pop());
        }
        return sb.reverse().toString();
    }
}