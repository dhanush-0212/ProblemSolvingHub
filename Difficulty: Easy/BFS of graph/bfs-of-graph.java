class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean[] vis=new boolean[adj.size()+1];
        
        Queue<Integer> q=new ArrayDeque<>();
        ArrayList<Integer> ans=new ArrayList<>();
        
        q.add(0);
        vis[0]=true;
        
        while(!q.isEmpty()){
            int vertice=q.remove();
            ans.add(vertice);
            ArrayList<Integer> nbrs=adj.get(vertice);
            for(int nbr:nbrs){
                if(!vis[nbr]){
                    q.add(nbr);
                    vis[nbr]=true;
                }
            }
        }
        return ans;
    }
}