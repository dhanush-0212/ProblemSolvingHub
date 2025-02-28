class Solution {
    public boolean isValid(String s) {
        Stack<Character> stck=new Stack<>();

       for(char c:s.toCharArray()){
        if(c=='(' || c=='{' || c=='['){
            stck.push(c);
        }
        else{
            if(stck.isEmpty()) return false;
            
            int top=stck.peek();
            if(c==')' && top!='(' ||
                c==']' && top!='[' ||
                c=='}' && top!='{')
                {
                    return false;
                }
                stck.pop();
        }
       }
        return stck.isEmpty();
    }
}