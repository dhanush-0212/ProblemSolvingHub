class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans=new HashMap<>();

        for(String str:strs){
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String s=new String(arr);
            if(!ans.containsKey(s)){
                ans.put(s,new ArrayList<>());
            }
           // else{
                ans.get(s).add(str);
            //}
        }
        return new ArrayList<>(ans.values());
    }
}