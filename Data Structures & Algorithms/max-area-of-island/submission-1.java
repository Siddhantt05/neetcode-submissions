class Solution {
    static int dfs(int[][] grid, int i,  int j){
        if(i<0 || i>=grid.length||j<0||j>=grid[0].length ||grid[i][j]==0 ||grid[i][j]==-1) return 0;
        grid[i][j]=-1;
        int left = dfs(grid,i,j-1);
        int right = dfs(grid,i,j+1);
        int up = dfs(grid,i-1,j);
        int down = dfs(grid,i+1,j);
        return 1+left+right+up+down;

    }
    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)
                ans=Math.max(ans,dfs(grid,i,j));
            }
        }
        return ans;
    }
}
