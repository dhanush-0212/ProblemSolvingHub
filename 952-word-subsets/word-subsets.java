class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] arr2=new int[26];
        List<String> ans=new ArrayList<>();
        for(String word:words2){
            int[] arr=new int[26];
            for(char c:word.toCharArray()){ arr[c -'a']++; }
            for (int i = 0; i < 26; i++) arr2[i] = Math.max(arr[i], arr2[i]);
        }
        
        for(String word:words1){
            int[] arr1=new int[26];
            for(char c:word.toCharArray()){ arr1[c-'a']++; }
            if(isuniversal(arr1,arr2)){ ans.add(word);}
        }
        return ans;
    }
    boolean isuniversal(int[] arr1,int[] arr2){
        for(int i=0;i<26;i++){
            if(arr2[i]>arr1[i]) return false;
        }
        return true;
    }
}