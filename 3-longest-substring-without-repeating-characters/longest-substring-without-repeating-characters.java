class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        //int r=0;
        int len=0;
        Set<Character> set=new HashSet<>();

        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
                
            }
            len=Math.max(len,r-l+1);
            set.add(c);
           
        }
        return len;
    }
}