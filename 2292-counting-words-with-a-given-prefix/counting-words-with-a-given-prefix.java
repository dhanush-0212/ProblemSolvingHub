class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(String s:words){
            int i;
            for(i=0;i<pref.length() && i<s.length();i++){
                if(s.charAt(i)!=pref.charAt(i)){
                    break;
                }
            }
            if(i==pref.length()){ count+=1;}
        }

        return count;
    }
}