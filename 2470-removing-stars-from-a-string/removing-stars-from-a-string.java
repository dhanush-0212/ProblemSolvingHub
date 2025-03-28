class Solution {
    public String removeStars(String s) {
        char[] ch=s.toCharArray();
        int i=0;
        for(char c:ch){
            if(c=='*') i--;
            else ch[i++]=c;
        }
        return new String(ch,0,i);
    }
}