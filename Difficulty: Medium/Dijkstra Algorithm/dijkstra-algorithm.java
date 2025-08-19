class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        ArrayList<ArrayList<int[]>> list=new ArrayList<>();
        for(int i=0;i<V;i++) list.add(new ArrayList<int[]>());
        for(int [] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            list.get(u).add(new int[]{w,v});
        }
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b) ->a[0]-b[0]);
        q.add(new int[]{0,src});
        dist[src]=0;
        while(!q.isEmpty()){
            int[] node=q.poll();
            int w=node[0];
            int v=node[1];
            
            for(int[] nbr:list.get(v)){
                int distance=nbr[0];
                int adjnode=nbr[1];
                if(distance+w< dist[adjnode]){
                    dist[adjnode]=distance+w;
                    q.add(new int[]{dist[adjnode],adjnode});
                }
            }
        }
        return dist;
    }
}