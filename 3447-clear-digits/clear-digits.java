class Solution {
    public String clearDigits(String s) {
        
       StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!(c>='a' && c<='z')){
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}