class Solution {
    static int [] dp;
    static int rec(int [] cost , int index){
        if(index>=cost.length) return 0;
        if(dp[index]!=-1) return dp[index];
        int one = cost[index]+rec(cost,index+1);
        int two = cost[index]+rec(cost,index+2);
        return dp[index]=Math.min(one,two);
    }
    public int minCostClimbingStairs(int[] cost) {
        dp= new int[cost.length+2];
        Arrays.fill(dp,-1);
        return Math.min(rec(cost,0),rec(cost,1));
    }
}
