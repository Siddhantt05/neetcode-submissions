class Solution {
    static int [][] dp;
    static int rec(String a , String b,int i , int j){
           if(i==a.length()) return b.length()-j;
        if(j==b.length()) return a.length()-i;
        if(dp[i][j]!=-1) return dp[i][j];
        char one = a.charAt(i);
        char two =b.charAt(j);
        if(one==two)return rec(a,b,i+1,j+1);
        int insert= 1+rec(a,b,i,j+1);
        int del = 1+rec(a,b,i+1,j);
        int rep= 1+rec(a,b,i+1,j+1);
        return dp[i][j]=Math.min(insert,Math.min(del,rep));
    }
    public int minDistance(String word1, String word2) {
        dp = new int[word1.length()+1][word2.length()+1];
        for(int [] t: dp)Arrays.fill(t,-1);
        return rec(word1,word2,0,0);
    }
}
