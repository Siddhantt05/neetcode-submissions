class Solution {
    static Boolean[][] dp;
    static boolean rec(int [] nums , int index, int sum){
        if(sum==0) return true;
        if(sum<0) return false;
        if(index>=nums.length) return false;
        if(dp[index][sum]!=null) return dp[index][sum];
        return dp[index][sum]=rec(nums, index+1, sum-nums[index])||rec(nums, index+1,sum);
    }
    public Boolean canPartition(int[] nums) {
        int sum=0;
        for(int t:nums) sum+=t;
        if(sum%2!=0) return false;
        dp= new Boolean[nums.length+1][(sum/2)+1];
        return rec(nums,0,sum/2);
    }
}
