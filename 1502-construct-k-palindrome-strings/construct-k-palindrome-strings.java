class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k) return false;
        if(s.length()==k) return true;

        int[] arr=new int[26];

        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        int value=0;
        for(int count:arr){
            if(count%2 == 1) value++;
        }
        return value<=k;
    }
}