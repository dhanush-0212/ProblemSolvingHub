class Solution {
    public int strStr(String haystack, String needle) {

        if (haystack.length() < needle.length()) {
            return -1;
        }
        //int i=0;int j=0;
        int n=needle.length();
        String s="";
        for(int i=0;i<=haystack.length()-n;i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                s=haystack.substring(i,i+n);
            }
            if(s.equals(needle)) return i;
            //i++;
        }
        return -1;
    }
}