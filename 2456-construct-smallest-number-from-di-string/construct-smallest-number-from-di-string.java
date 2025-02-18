class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder sb=new StringBuilder(); 
        Stack<Integer> num=new Stack<>();

        for(int i=0;i<=pattern.length();i++){
            num.push(i+1);

            if(i==pattern.length() || pattern.charAt(i)=='I'){
                while(!num.isEmpty()){
                    sb.append(num.pop());
                }
            }
        }
        return sb.toString();
    } 
}