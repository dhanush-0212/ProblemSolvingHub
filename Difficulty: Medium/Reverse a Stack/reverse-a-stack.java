// User function Template for Java

class Solution {
    static void reverse(Stack<Integer> s) {
        // add your code here
        if(s.isEmpty()) return;
        
        int top=s.pop();
        reverse(s);
        insert(s,top);
    }
    static void insert(Stack<Integer> stck,int ele){
        if(stck.isEmpty()){ 
            stck.push(ele); 
            return; 
        }
        int top=stck.pop();
        insert(stck,ele);
        stck.push(top);
    }
}