class Solution {
    static boolean check(int [][] grid , int mid , boolean [][] visit,int i , int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || visit[i][j] || grid[i][j]>mid)return false;
        if(i==grid.length-1 && j==grid[0].length-1) return true;
        visit[i][j]=true;
        return check(grid,mid,visit,i+1,j) || check(grid,mid,visit,i-1,j) || check(grid,mid,visit,i,j+1) || check(grid,mid,visit,i,j-1);
    }
    public int swimInWater(int[][] grid) {
        int max=-1;
        for(int [] t: grid){
            for(int a :t) max=Math.max(a,max);
        }
        int i=1;
       int ans=Integer.MAX_VALUE;
        while(i<=max){
            int mid = (i+max)/2;
            boolean [][] visit = new boolean [grid.length][grid[0].length];
            if(grid[grid.length-1][grid[0].length-1]<=mid && check(grid,mid,visit,0,0)){
                ans=Math.min(ans,mid);
                max=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return ans;
    }
}
