class Solution {
    static int [] dp;
    static int rec(String s , int i){
        if(i>=s.length()) return 1;
        if(s.charAt(i)=='0') return 0;
        if(dp[i]!=-1) return dp[i];
        if(s.charAt(i)=='1' && i+1<s.length()) return dp[i]= rec(s,i+1)+rec(s,i+2);
        if(s.charAt(i)=='2'){
            int a =0;
            if(i+1<s.length()){
            char t =s.charAt(i+1);
            if(t>='0' && t<='6') a = rec(s,i+2);
            }
            return dp[i]=rec(s,i+1)+a;
        }
        return dp[i]=rec(s,i+1); 
    }
    public int numDecodings(String s) {
        dp= new int[s.length()+1];
        Arrays.fill(dp,-1);
        return rec(s,0);
    }
}
