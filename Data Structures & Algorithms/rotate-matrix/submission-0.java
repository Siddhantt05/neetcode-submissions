class Solution {
    static void reverse(int [][]mat){
        for(int [] t: mat){
            int i=0;
            int j=t.length-1;
            while(i<j){
                int tem =t[i];
                t[i]=t[j];
                t[j]=tem;
                i++;
                j--;
            }
        }
    }
    static void transpose(int [][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat[0].length;j++){
                int tem = mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=tem;
            }
        }
    }
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
}
