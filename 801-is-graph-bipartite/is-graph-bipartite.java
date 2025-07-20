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
                if(!ispartition(i,ans,graph,0)){
                    return false;
                }
            }
        }
        return true;
    }
    boolean ispartition(int start,int[] ans,int[][] graph,int colour){


        //if(ans[start] !=-1) return;
        ans[start]=colour;


        for(int nbr:graph[start]){
            if(ans[nbr] ==-1){
                if(!ispartition(nbr,ans,graph,1-colour )) return false;
            }
            else if(nbr !=-1 && ans[start] == ans[nbr]){
                return false;
            }
        }
        return true;
    }
}