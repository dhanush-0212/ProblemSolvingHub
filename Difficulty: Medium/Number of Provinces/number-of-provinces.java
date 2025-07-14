// User function Template for Java

class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int v) {
        // code here
        boolean[] vis=new boolean[v];
        int cnt=0;
        for(int i=0;i<v;i++){
            if(!vis[i]){
                dfs(i,adj,vis);
                cnt++;
            }
        }
        return cnt;
    }
    static void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] vis){
        
        vis[node]=true;
        
        for(int i=0;i<adj.get(node).size();i++){
            if(i!= node && adj.get(node).get(i)==1 && !vis[i]){
                dfs(i,adj,vis);
            }
        }
    }
};