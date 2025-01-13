class Solution {
    public int minimumLength(String s) {
        int arr[]=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        int value=0,result=0;
        for(int num:arr){
            if (num == 0) continue;
            result+=num%2 == 0? 2:1;
            
        }
        return result;
    }
}