// User function Template for Java
class Solution {

    public int[] shortestPath(int v, int E, int[][] edges) {
        // Code here
        ArrayList<ArrayList<int[]>> list=new ArrayList<>();
        for(int i=0;i<v;i++) list.add(new ArrayList<int[]>());
        for(int[] edge:edges){
            list.get(edge[0]).add(new int[]{edge[1],edge[2]});
        }
        int[] vis=new int[v];
        Arrays.fill(vis,Integer.MAX_VALUE);
        vis[0]=0;
        Queue<Integer> q=new ArrayDeque<>();
        // for(int i=0;i<v;i++){
        // }
        q.add(0);
        while(!q.isEmpty()){
            int node=q.poll();
            
            for(int nbr[]:list.get(node)){
                int to=nbr[0];
                int dist=nbr[1];
                if(vis[node]+dist<vis[to]){
                    vis[to]=dist+vis[node];
                    q.add(to);
                }
            }
        }
         for(int i=0;i<v;i++){
             if(vis[i]==Integer.MAX_VALUE) vis[i]=-1;
        }
        return vis;
    }
}