class Solution {
    public int compress(char[] chars) {
        int idx=0;
        int j=0;
        for(int i=0;i<chars.length;){
            chars[idx++]=chars[i];
            j=i+1;
            while(j<chars.length && chars[i]==chars[j]) j++;

            if(j-i >1){
                String freq=j-i+"";
                for(char c:freq.toCharArray()){
                    chars[idx++]=c;
                }
            }
            i=j;
        }
        return idx;
    }
}