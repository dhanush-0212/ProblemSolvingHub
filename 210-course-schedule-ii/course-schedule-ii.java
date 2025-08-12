class Solution {
    public int[] findOrder(int n, int[][] prerequisites) {
        int[] vis = new int[n];
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int[] pre : prerequisites) {
            int u = pre[0];
            int v = pre[1];
            graph.get(v).add(u); // reversed edge for order
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!dfs(i, graph, vis, ans)) return new int[0]; // cycle
        }

        Collections.reverse(ans);
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean dfs(int node, List<List<Integer>> graph, int[] vis, List<Integer> ans) {
        if (vis[node] == 1) return false; // cycle
        if (vis[node] == 2) return true;  // already done

        vis[node] = 1; // visiting
        for (int nbr : graph.get(node)) {
            if (!dfs(nbr, graph, vis, ans)) return false;
        }
        vis[node] = 2; // done
        ans.add(node); // postorder add
        return true;
    }
}
