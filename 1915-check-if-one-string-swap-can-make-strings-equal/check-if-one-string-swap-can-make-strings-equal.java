class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        char s1arr[]=new char[26];
        char s2arr[]=new char[26];
        int diff=0;
        for(int i=0;i<s1.length();i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);

            if(c1 !=c2){
                diff++;
                if(diff> 2) return false;
            }

            s1arr[c1 - 'a']++;
            s2arr[c2-'a']++;
        }
        return Arrays.equals(s1arr,s2arr);
    }
}