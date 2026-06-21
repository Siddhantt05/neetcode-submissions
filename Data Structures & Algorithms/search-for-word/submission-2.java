class Solution {
    static boolean rec(char [][] mat , int i , int j , boolean[][] visit , String word , int index){
        if(index>=word.length()) return true;
        if(i<0 || i>=mat.length || j<0 || j>=mat[0].length || visit[i][j] || word.charAt(index)!=mat[i][j]) return false;
        visit[i][j]=true;
       boolean ans= rec(mat,i+1,j,visit,word,index+1)||rec(mat,i-1,j,visit,word,index+1)||rec(mat,i,j+1,visit,word,index+1)||rec(mat,i,j-1,visit,word,index+1);
       visit[i][j]=false;
       return ans;
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean [][] visit =new boolean[board.length][board[0].length];
                    if(rec(board,i,j,visit,word,0)) return true;
                }
            }
        }
        return false;
    }
}
