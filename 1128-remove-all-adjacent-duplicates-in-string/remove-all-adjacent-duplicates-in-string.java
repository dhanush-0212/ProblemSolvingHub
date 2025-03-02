class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stck=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(!stck.isEmpty() && stck.peek()==c){
                stck.pop();
            }else{
                stck.push(c);
            }
        }
        while(!stck.isEmpty()){
            sb.append(stck.pop());
        }
        return sb.reverse().toString();
    }
}