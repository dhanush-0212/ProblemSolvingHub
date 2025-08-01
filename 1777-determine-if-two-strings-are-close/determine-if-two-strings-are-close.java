class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(char c:word1.toCharArray()){
            freq1[c-'a']++;
        }
        for(char c:word2.toCharArray()){
            if(freq1[c-'a']==0) return false;
            freq2[c-'a']++;
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }
}