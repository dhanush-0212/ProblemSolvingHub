class MinStack {

    Stack<Integer> stck;
    Stack<Integer> min;
    
    public MinStack() {
        stck=new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int val) {
        
        if(min.isEmpty() ||min.peek()>=val) 
            min.push(val);

        stck.push(val);
    }
    
    public void pop() {
        if(stck.isEmpty()) return;
        if(!min.isEmpty() && min.peek().equals(stck.peek())) min.pop();
        stck.pop();
    }
    
    public int top() {
        return stck.isEmpty()?-1:stck.peek();
    }
    
    public int getMin() {
        return min.isEmpty()?-1:min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */