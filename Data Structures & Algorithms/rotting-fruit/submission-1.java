class Solution {
    public int orangesRotting(int[][] grid) {
        boolean [][] visited = new boolean[grid.length][grid[0].length];
        Queue<int[]> q = new LinkedList<>();
        int fresh =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) fresh++;
                if(grid[i][j]==2){
                    visited[i][j]=true;
                    q.add(new int[]{i,j});
                }
            }
        }
        int time=0;
        if(fresh==0) return time;
        while(!q.isEmpty()){
            int s = q.size();
            for(int i=0;i<s;i++){
                int [] arr = q.poll();
                int [][] dir = {{arr[0]-1,arr[1]},{arr[0]+1,arr[1]},{arr[0],arr[1]-1},{arr[0],arr[1]+1}};
                for(int [] t : dir){
                    if(t[0]<0 || t[0]>=grid.length||t[1]<0 || t[1]>=grid[0].length||grid[t[0]][t[1]]==0||visited[t[0]][t[1]]) continue;
                    else{
                        fresh--;
                       q.add(new int[]{t[0],t[1]});
                       visited[t[0]][t[1]]=true;
                    }

                }
            }
            time++;
            if(fresh==0) return time;
        }
        return -1;
    }
}
