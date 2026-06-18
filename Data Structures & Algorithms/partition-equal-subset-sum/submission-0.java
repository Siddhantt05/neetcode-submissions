class Solution {
    static boolean rec(int [] nums , int index, int sum){
        if(sum==0) return true;
        if(sum<0) return false;
        if(index>=nums.length) return false;
        return rec(nums, index+1, sum-nums[index])||rec(nums, index+1,sum);
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int t:nums) sum+=t;
        if(sum%2!=0) return false;
        return rec(nums,0,sum/2);
    }
}
