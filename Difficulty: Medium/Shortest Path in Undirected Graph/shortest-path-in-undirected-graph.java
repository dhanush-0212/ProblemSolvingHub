
class Solution {
    
    // Function to find the shortest path from a source node to all other nodes
    public int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int src) {
        // code here
        Queue<Integer> q=new ArrayDeque<>();
        q.add(src);
        int[] vis=new int[adj.size()];
        Arrays.fill(vis,Integer.MAX_VALUE);
        vis[src]=0;
        while(!q.isEmpty()){
            int node=q.poll();
            
            for(int nbr:adj.get(node)){
                if(vis[nbr]+1<vis[node]){
                    vis[nbr]=1+vis[node];
                    q.add(nbr);
                }
            }
        }
        for(int i=0;i<vis.length;i++){
            if(vis[i]==Integer.MAX_VALUE) vis[i]=-1;
        }
        return vis;
    }
}
