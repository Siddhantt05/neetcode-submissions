class Solution {
    static Boolean [][]dp;
    static boolean rec(String s , int sc , int i){
        if(i>=s.length()) return sc==0;
        if(sc<0) return false;
        if(dp[i][sc]!=null) return dp[i][sc];
        boolean ans=false;
        if(s.charAt(i)=='(') ans=ans|| rec(s,sc+1,i+1);
        if(s.charAt(i)==')') ans=ans|| rec(s,sc-1,i+1);
        if(s.charAt(i)=='*') ans=ans|| rec(s,sc+1,i+1)|| rec(s,sc-1,i+1)||rec(s,sc,i+1);
        return dp[i][sc]=ans;
    }
    public boolean checkValidString(String s) {
        dp= new Boolean[s.length()+1][s.length()+1];
        return rec(s,0,0);
    }
}
