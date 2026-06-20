class Solution {
    static int [][] dp;
    static int rec(int m , int n , int i , int j){
        if(i>=m || j>=n) return 0;
        if(i==m-1 && j==n-1) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        int right = rec(m,n,i,j+1);
        int down = rec(m,n,i+1,j);
        return dp[i][j]=right+down;
    }
    public int uniquePaths(int m, int n) {
        dp= new int[m+1][n+1];
        for(int []t: dp)Arrays.fill(t,-1);
        return rec(m,n,0,0);
    }
}
