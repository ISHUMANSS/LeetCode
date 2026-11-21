
class Solution {
    int[] ans;

    void dfs(int root, List<List<Integer>> g, int[] parent, String s, int[] recentPar){
        int i = s.charAt(root) - 'a';
        if(recentPar[i] != -1) parent[root] = recentPar[i]; // if the recent par char node value is not -1 then there is an acenstor exists which has same char value
        recentPar[i] = root;          // update the recent parent for the current char with current node 
        for(int n : g.get(root)) dfs(n, g, parent, s, Arrays.copyOf(recentPar, recentPar.length));
        if(parent[root] >= 0) ans[parent[root]] += ans[root];     // while returning collect the tree size to its parent
    }

    int[] findSubtreeSizes(int[] parent, String s) {
        ans = new int[parent.length];
        Arrays.fill(ans, 1);
        int[] recentParent = new int[26];
        Arrays.fill(recentParent, -1);
        List<List<Integer>> g = new ArrayList<>();
        for(int i = 0; i < parent.length; ++i) g.add(new ArrayList<>());
        for(int i = 1; i < parent.length; ++i) g.get(parent[i]).add(i);  // create graph from the parent mapping 
        dfs(0, g, parent, s, recentParent);   // do dfs from root to leaf node to  check parent updates
        return ans;
    }
}