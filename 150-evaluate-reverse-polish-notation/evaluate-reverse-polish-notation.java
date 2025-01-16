class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stck=new Stack<>();
        for(String c:tokens){
            if(c.equals("+")) {
                stck.push(stck.pop() + stck.pop());
            }
            else if(c.equals("-")){
                int second = stck.pop();
                int first = stck.pop();
                stck.push(first - second);
            } 
            else if(c.equals("*")){
                stck.push(stck.pop() * stck.pop());
            } 
            else if(c.equals("/")){
                int second = stck.pop();
                int first = stck.pop();
                stck.push(first / second);
            }
            else 
                stck.push(Integer.valueOf(c));
        }
        return stck.peek();
    }
}