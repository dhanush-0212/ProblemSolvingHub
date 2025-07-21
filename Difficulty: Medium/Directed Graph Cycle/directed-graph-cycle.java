class Solution {
    public boolean isCyclic(int v, int[][] edges) {
        // code here
        boolean[] vis=new boolean[v];
        boolean[] path=new boolean[v];
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int i=0;i<v;i++) ans.add(new ArrayList<Integer>());
        
        for(int[] edge:edges){
            int from=edge[0];
            int to=edge[1];
            ans.get(from).add(to);
        }
        
        for(int i=0;i<v;i++){
            if(!vis[i]){
                if(dfs(i,vis,path,ans)) return true;
            }
        }
        return false;
    }
    public boolean dfs(int start,boolean[] vis,boolean[] path,List<List<Integer>> list){
        
        path[start]=true;
        vis[start]=true;
        
        for(int nbr:list.get(start)){
            if(!vis[nbr]){
                if(dfs(nbr,vis,path,list)){
                    return true;
                }
            }
            else if(vis[nbr] && path[nbr]){
                return true;
            }
        }
        path[start]=false;
        vis[start]=false;
        return false;
    }
}