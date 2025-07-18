// User function Template for Java

class Solution {
    public ArrayList<ArrayList<String>> findSequences(String startWord,
                                                      String targetWord,
                                                      String[] wordList) {
        // Code here
        ArrayList<ArrayList<String>> ans=new ArrayList<>();
        Set<String> set=new HashSet<>();
        List<String> lastused=new ArrayList<>();
        Queue<List<String>> q=new ArrayDeque<>();
        
        lastused.add(startWord);
        q.add(new ArrayList<String>(lastused));
        for(String word:wordList){
            set.add(word);
        }
        int level=0;
        while(!q.isEmpty()){
            List<String> temp=q.poll();
            
            while(temp.size()>level){
                level++;
                for(String word:lastused){
                    set.remove(word);
                }
            }
            String lastword=temp.get(temp.size()-1);
            
            if(lastword.equals(targetWord)){
                if(ans.size()==0) ans.add(new ArrayList<String>(temp));
                else if(ans.get(0).size() == temp.size()) ans.add(new ArrayList<>(temp));
            }
            
            for(int i=0;i<lastword.length();i++){
                char[] arr=lastword.toCharArray();
                for(char ch='a'; ch<='z';ch++){
                    arr[i]=ch;
                    String changedword=new String(arr);
                    if(set.contains(changedword)){
                        lastused.add(changedword);
                        temp.add(changedword);
                        q.add(new ArrayList<String>(temp));
                        temp.remove(temp.size()-1);
                    }
                }
            }
        }
        return ans;
    }
}