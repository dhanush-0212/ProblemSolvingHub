class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        
        int[] vis=new int[n];
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++) graph.add(new ArrayList<Integer>());

        for(int i=0;i<prerequisites.length;i++){
            int[] temp=prerequisites[i];
            int u=temp[0];
            int v=temp[1];
            graph.get(v).add(u);
        }
        for(int i=0;i<n;i++){
           if(!dfs(i,graph,vis)) return false; 
        }
        return true;
    }
    public boolean dfs(int i,List<List<Integer>> graph,int[] vis){
        if(vis[i]==1) return false;
        if(vis[i]==2) return true;

        vis[i]=1;
        for(int nbr:graph.get(i)){
            if(!dfs(nbr,graph,vis)) 
                return false; 
        }
        vis[i]=2;
        return true;
    }
}