class Solution {
    public static ArrayList<Integer> topoSort(int v, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
         for(int i=0;i<v;i++){
             list.add(new ArrayList<Integer>());
         }
         for(int[] edge:edges){
             int from=edge[0];
             int to =edge[1];
             list.get(from).add(to);
         }
         
         int[] indegree=new int[v];
         for(int[] edge:edges){
             int from=edge[0];
             int to=edge[1];
             indegree[to]++;
         }
         Queue<Integer> q=new ArrayDeque<>();
         for(int i=0;i<v;i++){
             if(indegree[i]==0) q.add(i);
         }
         
         ArrayList<Integer> topo=new ArrayList<>();
         
         while(!q.isEmpty()){
             int node=q.remove();
             topo.add(node);
             for(int i:list.get(node)){
                 indegree[i]--;
                 if(indegree[i]==0){
                     q.add(i);
                 }
             }
         }
         return topo;
    }
}