class Solution {
    static Boolean [][][] dp;
    static boolean rec(String s1, String s2,String s3 , int i ,int j , int k){
        if(i>=s1.length()){
            while(j<s2.length()){
                if(s2.charAt(j)!=s3.charAt(k))return false;
                else{
                    j++;
                    k++;
                }
            }
            return true;
        }
        if(j>=s2.length()){
            while(i<s1.length()){
                if(s1.charAt(i)!=s3.charAt(k))return false;
                else{
                    i++;
                    k++;
                }
            }
            return true;
        }
        if(dp[i][j][k]!=null) return dp[i][j][k];
        boolean ans=false;
        if(s1.charAt(i)==s3.charAt(k) && s2.charAt(j)==s3.charAt(k)) ans= rec(s1,s2,s3,i+1,j,k+1)||rec(s1,s2,s3,i,j+1,k+1)||ans;
        if(s1.charAt(i)==s3.charAt(k))ans=ans||rec(s1,s2,s3,i+1,j,k+1);
        if(s2.charAt(j)==s3.charAt(k))ans=ans|| rec(s1,s2,s3,i,j+1,k+1);
        return dp[i][j][k]=ans;

    }
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()==0 && s2.length()==0) return s3.length()==0;
        if(s1.length()+s2.length()>s3.length() || s1.length()+s2.length()<s3.length()) return false;
        dp=new Boolean[s1.length()+1][s2.length()+1][s3.length()+1];
        return rec(s1,s2,s3,0,0,0);
    }
}
