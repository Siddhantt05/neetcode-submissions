class Solution {
    static int [][] dp ;
    static int rec(String a , String b , int i , int j){
        if(i>=a.length() || j>=b.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return 1+ rec(a,b,i+1,j+1);
        return dp[i][j]=Math.max(rec(a,b,i+1,j),rec(a,b,i,j+1));
    }
    public int longestCommonSubsequence(String text1, String text2) { 
        dp = new int [text1.length()+1][text2.length()+1];
        for(int [] t : dp)Arrays.fill(t,-1);
        return rec(text1,text2,0,0);
    }
}
