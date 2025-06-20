class Solution {
    public String reverseWords(String s) {
        // Code here
        String[] words=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder(); 
        for(String word:words){
            sb.append(new StringBuilder(word).reverse());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
