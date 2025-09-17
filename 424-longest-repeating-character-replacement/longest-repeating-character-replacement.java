class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,maxLen=0,maxFreq=0;
        int[] arr=new int[26];
        while(r<s.length()){

            char c=s.charAt(r);
            arr[c-'A']++;
            maxFreq=Math.max(maxFreq,arr[c-'A']);

            if((r-l+1) - maxFreq > k){
                arr[s.charAt(l)-'A']--;
                l++;
            }

            if((r-l+1) - maxFreq <= k)
                maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}