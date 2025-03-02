class Solution {
    public String makeGood(String s) {
        Stack<Character> stck=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(!stck.isEmpty() && Math.abs(c-stck.peek()) == 32){
                stck.pop();
            }
            else{
                stck.push(c);
            }
        }
        if(stck.isEmpty()) return "";
        while(!stck.isEmpty()){
            sb.insert(0,stck.pop());
        }
        return sb.toString();
    }
}