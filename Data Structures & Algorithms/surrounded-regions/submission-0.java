class Solution {
    static void dfs(char [][] board , int i , int j){
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]=='X' || board[i][j]=='Y') return;
        board[i][j]='Y';
        dfs(board,i+1,j);
        dfs(board,i-1,j);
        dfs(board,i,j+1);
        dfs(board,i,j-1);
    } 
    public void solve(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(i==0 || j==0 || j==board[0].length-1 || i== board.length-1){
                    if(board[i][j]=='O'){
                        dfs(board,i,j);
                    }
                }
            }
        }
        for(char [] t: board){
            for(int i=0;i<t.length;i++){
                if(t[i]=='Y')t[i]='O';
                else if(t[i]=='O')t[i]='X';
               
            }
        }
    }
}
