class Solution {
    static boolean check(char [][] mat , int i , int j){
       int n = mat.length;

    // vertical
    for (int row = 0; row < n; row++) {
        if (row != i && mat[row][j] == 'Q')
            return false;
    }

    // horizontal
    for (int col = 0; col < n; col++) {
        if (col != j && mat[i][col] == 'Q')
            return false;
    }

    // top-left
    for (int row = i - 1, col = j - 1; row >= 0 && col >= 0; row--, col--) {
        if (mat[row][col] == 'Q')
            return false;
    }

    // top-right
    for (int row = i - 1, col = j + 1; row >= 0 && col < n; row--, col++) {
        if (mat[row][col] == 'Q')
            return false;
    }

    // bottom-left
    for (int row = i + 1, col = j - 1; row < n && col >= 0; row++, col--) {
        if (mat[row][col] == 'Q')
            return false;
    }

    // bottom-right
    for (int row = i + 1, col = j + 1; row < n && col < n; row++, col++) {
        if (mat[row][col] == 'Q')
            return false;
    }

    return true;


    }
    static void rec(char [][] mat , int row,  List<List<String>> ans){
        if(row>=mat.length){
            List<String> tem = new ArrayList<>();
            for(char [] t: mat){
                String a = new String(t);
                tem.add(new String(a));
            }
            ans.add(new ArrayList<>(tem));
            return;
        }
        //if(col>=mat.length) return;
        for(int i=0;i<mat.length;i++){
            mat[row][i]='Q';
            if(check(mat,row,i)) rec(mat,row+1,ans);
            mat[row][i]='.';
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] mat = new char[n][n];
        List<List<String>> ans = new ArrayList<>();
        for(char [] t : mat)Arrays.fill(t,'.');
        rec(mat,0,ans);
        return ans;
    }
}
