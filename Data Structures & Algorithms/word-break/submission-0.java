class Solution {
    static Boolean [] dp;
    static boolean rec(String s , Set<String> st,int index){
        if(index>=s.length()){
             return true;
            //return false;
        }
        if(dp[index]!=null) return dp[index];
        boolean ans=false;
        StringBuilder t = new StringBuilder();
        for(int i=index;i<s.length();i++){
            t.append(s.charAt(i));
            if(st.contains(t.toString()))ans = ans||rec(s,st,i+1);
        }
        return dp[index]=ans;
    } 
    public boolean wordBreak(String s, List<String> wordDict) {
        dp= new Boolean[s.length()+1];
        Set<String> st = new HashSet<>();
        for(String t :wordDict) st.add(t);
         return rec(s,st,0);
    }
}
