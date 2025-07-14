class Solution {
    public boolean isCycle(int v, int[][] edges) {
        // Code here
        boolean[] vis=new boolean[v];
        
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<v;i++){
            list.add(new ArrayList<>());
        }
        
        for(int i=0;i<edges.length;i++){
            int from=edges[i][0];
            int to=edges[i][1];
           list.get(from).add(to);
           list.get(to).add(from);
        }
        
        for(int i=0;i<v;i++){
            if(!vis[i]){
                if(dfs(i,-1,vis,list)) return true;
            }
        }
        
        return false;
    }
    
    boolean dfs(int src,int parent,boolean[] vis,List<List<Integer>> list){
       
       if(vis[src]) return true;
       
       vis[src]=true;
       
       for(int nbr:list.get(src)){
           if(nbr != parent){
               if(dfs(nbr,src,vis,list)) return true;
           }
       }
       return false;
        
    }
    
}