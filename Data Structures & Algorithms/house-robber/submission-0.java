class Solution {
    static int [] dp ;
    static int rec(int [] nums, int idx){
        if(idx>=nums.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int pick = nums[idx]+rec(nums,idx+2);
        int skip= rec(nums,idx+1);
        return dp[idx]= Math.max(pick,skip);
    }
    public int rob(int[] nums) {
        dp = new int [nums.length+1];
        Arrays.fill(dp,-1);
        return rec(nums,0);
    }
}
