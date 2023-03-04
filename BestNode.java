
class Solution {
    
public static long bestNode(int N, int[] A, int[] P) {
           List<Integer>[] adj = new List[N + 1];
    for(int i = 1; i <= N; i++) {
        adj[i] = new ArrayList<>();
    }
    for(int i = 1; i < N; i++) {
        adj[P[i]].add(i + 1);
    }
    long ans = Long.MIN_VALUE;
    for(int i = 1; i <= N; i++) {
        ans = Math.max(ans, dfs(i, adj, A, false));
    }
    return ans;
}

public static long dfs(int node, List<Integer>[] adj, int[] A, boolean f) {
    long ans = Long.MIN_VALUE;
    for(int child : adj[node]) {
        ans = Math.max(ans, dfs(child, adj, A, !f));
    }
    long nodeVal = A[node - 1];
    if(f) {
        nodeVal = -nodeVal;
    }
    if(ans == Long.MIN_VALUE) {
        return nodeVal;
    }
    return ans + nodeVal;

    }
}
        
