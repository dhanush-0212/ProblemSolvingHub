class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int ans=0,l=0;

        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            while(hs.contains(c)){
                hs.remove(s.charAt(l));
                
                l++;
            }
            
            ans=Math.max(ans,r-l+1);
            hs.add(c);
        }
        return ans;
    }
}