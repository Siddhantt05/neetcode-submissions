class Solution {
    static int [][] dp;
    static int rec(int [] nums , int target , int index){
        if(index>=nums.length){
            if(target==0) return 1;
            return 0;
        }
        if(dp[index][target+1000]!=-1) return dp[index][target+1000];
        int pick =rec(nums,target+nums[index],index+1);
        int skip=rec(nums,target-nums[index],index+1);
        return dp[index][target+1000]=pick+skip;
    }
    public int findTargetSumWays(int[] nums, int target) {
        dp= new int[nums.length+1][2001];
        for(int [] t : dp)Arrays.fill(t,-1);
        return rec(nums,target,0);
    }
}
