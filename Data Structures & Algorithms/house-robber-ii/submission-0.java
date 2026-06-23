class Solution {
    static int rec1(int []nums, int index,int[]dp){
        if(index>=nums.length-1) return 0;
        if(dp[index]!=-1) return dp[index];
        int pick = 0;
        pick=nums[index]+rec1(nums,index+2,dp);
        int skip=rec1(nums,index+1,dp);
        return dp[index]=Math.max(pick,skip);
    }
    static int rec2(int []nums, int index,int[] dp){
        if(index>=nums.length) return 0;
        if(dp[index]!=-1) return dp[index];
        int pick        =0;
        pick=nums[index]+rec2(nums,index+2,dp);
        int skip=rec2(nums,index+1,dp);
        return dp[index]=Math.max(pick,skip);
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int [] dp = new int [nums.length+1];
        Arrays.fill(dp,-1);
        int a =rec1(nums,0,dp);
       Arrays.fill(dp,-1);
        int b=rec2(nums,1,dp);
        return Math.max(a,b);
    }
}