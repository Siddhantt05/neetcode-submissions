class Solution {
    static void build(int [][] edges ,HashMap<Integer,List<Integer>> map){
        for(int [] t : edges){
            int a = t[0];
            int b= t[1];
            map.putIfAbsent(a,new ArrayList<>());
            map.putIfAbsent(b,new ArrayList<>());
            map.get(a).add(b);
            map.get(b).add(a);

        }
    }
    static void dfs(HashMap<Integer,List<Integer>> graph , int node,boolean [] visited){
     visited[node]=true;
     if(graph.containsKey(node))
     for(int t : graph.get(node)){
        if(!visited[t]){
            dfs(graph,t,visited);
        }
     }
    }
    public int countComponents(int n, int[][] edges) {
           HashMap<Integer,List<Integer>> graph = new HashMap<>();
           build(edges,graph);
           boolean [] visited = new boolean [n];
           int ans=0;
           for(int i=0;i<n;i++){
            if(!visited[i]){
                ans++;
                dfs(graph,i,visited);
            }
           }
           return ans;
    }
}
