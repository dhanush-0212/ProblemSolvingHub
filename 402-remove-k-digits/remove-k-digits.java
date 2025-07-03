class Solution {
    public String removeKdigits(String num, int k) {

        StringBuilder sb=new StringBuilder();
        Stack<Character> stck=new Stack<>();

        for(char c:num.toCharArray()){
           
           while( !stck.isEmpty() && k>0 &&  stck.peek()> c) {
            stck.pop();
            k--;
           
           }
          
            stck.push(c);
        }

        //if(stck.size()<k) return "0";
        while(k>0 && !stck.isEmpty()) { stck.pop(); k--;}

        while(!stck.isEmpty()){
            sb.append(stck.pop());
        }
        sb.reverse(); // Reverse to get the correct order
        
        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.length()>0 ?sb.toString():"0"; 
        
    }
}