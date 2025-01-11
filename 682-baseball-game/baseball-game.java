class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stck=new Stack<>();

        for(String op:operations){
            if(op.equals("+")){
                int top=stck.pop();
                int newtop=stck.peek()+top;
                stck.push(top);
                stck.push(newtop);
            }
            else if(op.equals("C")) stck.pop();
            else if(op.equals("D")) stck.push(2*stck.peek());
            else stck.push(Integer.valueOf(op));
        }
        int ans=0;
        for(int val:stck) ans+=val;
        return ans;
    }
}