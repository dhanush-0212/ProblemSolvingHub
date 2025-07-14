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
                if(bfs(i,v,vis,list)) return true;
            }
        }
        
        return false;
    }
    
    boolean bfs(int node,int v,boolean[] vis,List<List<Integer>> list){
        vis[node]=true;
        Queue<int[]> q=new ArrayDeque<>();
        
        q.add(new int[]{node,-1});
        
        while(!q.isEmpty()){
            int[] temp=q.poll();
            int src=temp[0];
            int parent=temp[1];
            
            for(int nbr:list.get(src)){
                if(!vis[nbr]){
                    vis[nbr]=true;
                    q.add(new int[]{nbr,src});
                }
                else if(parent != nbr){
                    return true;
                }
            }
            
        }
        return false;
        
    }
    
}