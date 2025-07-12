class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[] =new boolean[adj.size()];
        
        ArrayList<Integer> ans=new ArrayList<>();
        
        helper(0,ans,vis,adj);
        return ans;
    }
    public void helper(int node,List<Integer> ans,boolean[] vis,ArrayList<ArrayList<Integer>> adj){
        
        ans.add(node);
        vis[node]=true;
        
        for(int nodes:adj.get(node)){
            if(!vis[nodes]){
                helper(nodes,ans,vis,adj);
            }
        }
    }
}