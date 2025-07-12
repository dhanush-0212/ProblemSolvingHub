class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] vis=new boolean[n];

        int cnt=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,vis,isConnected,n);
                cnt++;
            }
        }
        return cnt;
    }
    void dfs(int node,boolean[] vis,int[][] isConnected,int n){

        vis[node]=true;

        //Arraylist<Integer> nodes=adj.get(node);
        for(int i=0;i<n;i++){
            if(!vis[i] && isConnected[node][i] == 1 && node !=i){
                dfs(i,vis,isConnected,n);
                //vis[i]=true;
            }
        }
    }
}