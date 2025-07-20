class Solution {
    public boolean isBipartite(int[][] graph) {
        //int[] vis=new int[graph.length];

        // List<List<Integer>> list=new ArrayList<>();

        // for(int i=0;i<graph.length;i++){
        //     for(int j=0;j<graph[0].length;j++){
        //         list.get(i).add(graph[i][j]);
        //     }
        // } 

        int ans[]=new int[graph.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<graph.length;i++){
            if(ans[i] == -1){
                if(!ispartition(i,ans,graph)){
                    return false;
                }
            }
        }
        return true;
    }
    boolean ispartition(int start,int[] ans,int[][] graph){

        Queue<Integer> q=new ArrayDeque<>();
        q.add(start);
        ans[start]=0;
        while(!q.isEmpty()){
            int node=q.poll();
            for(int nbr: graph[node]){
                if(ans[nbr]==-1){
                    ans[nbr]=1-ans[node];
                    q.add(nbr);
                }
                else if(ans[nbr] == ans[node] && ans[nbr] !=-1){
                    return false;
                }
            }
        }
        return true;
    }
}