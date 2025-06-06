/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        if(s.isEmpty()) return s;
        
        int ele=s.pop();
        sort(s);
        insert(s,ele);
        
        return s;
    }
    public void insert(Stack<Integer> stck,int ele){
        if(stck.isEmpty() || stck.peek()<=ele){
            stck.push(ele);
            return;
        }
        int top=stck.pop();
        insert(stck,ele);
        stck.push(top);
    }
}