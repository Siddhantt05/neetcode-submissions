class Solution {
    static int [][] dp;
    static int rec(int[] coins , int amount , int index){
        if(amount==0) return 0;
        if(index>=coins.length) {
          return Integer.MAX_VALUE/2;
        }
        if (dp[index][amount]!=-1) return dp[index][amount];
        int take=Integer.MAX_VALUE;
        if(coins[index]<=amount) take=Math.min(take , 1+rec(coins,amount-coins[index],index));
        int skip = rec(coins,amount, index+1);
        return dp[index][amount]=Math.min(take,skip);
    }
    public int coinChange(int[] coins, int amount) {
        dp= new int[coins.length+1][10001];
        for(int []t :dp)
        Arrays.fill(t,-1);
        int ans=rec(coins , amount,0);
       return  ans==1073741823?-1:ans;
    }
}
