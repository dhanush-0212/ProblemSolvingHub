class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set=new HashSet<>();
        Queue<pair> q=new ArrayDeque<>();

        for(String word:wordList){
            set.add(word);
        }
        q.add(new pair(beginWord,1));
        set.remove(beginWord);

        while(!q.isEmpty()){
            pair p=q.poll();
            String word=p.word;
            int steps=p.steps;

            if(word.equals(endWord)) return steps;

            for(int i=0;i<word.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char[] arr=word.toCharArray();
                    arr[i]=ch;

                    String changedword=new String(arr);

                    if(set.contains(changedword)){
                        set.remove(changedword);
                        q.add(new pair(changedword,steps+1));
                    }
                }
            }
        }
        return 0;
    }
}
class pair{
    String word;
    int steps;
    pair(String word,int steps){
        this.word=word;
        this.steps=steps;
    }
}