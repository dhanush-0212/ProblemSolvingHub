class Solution {
    public static ArrayList<Integer> topoSort(int v, int[][] edges) {
        // code here
         ArrayList<Integer> ans=new ArrayList<>();
         ArrayList<ArrayList<Integer>> list=new ArrayList<>();
         for(int i=0;i<v;i++){
             list.add(new ArrayList<Integer>());
         }
         for(int[] edge:edges){
             int from=edge[0];
             int to =edge[1];
             list.get(from).add(to);
         }
         
         boolean[] vis=new boolean[v];
         Stack<Integer> stck=new Stack<>();
         for(int i=0;i<v;i++){
            if(!vis[i])
                dfs(i,list,vis,stck);
         }
         
         while(!stck.isEmpty()){
             ans.add(stck.pop());
         }
         return ans;
    }
    public static void dfs(int node ,ArrayList<ArrayList<Integer>> list,boolean[] vis,Stack<Integer> stck){
        vis[node]=true;
        for(int i:list.get(node)){
            if(!vis[i])
                dfs(i,list,vis,stck);
        }
        stck.push(node);
    }
}