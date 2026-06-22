class Solution {
    public int missingNumber(int[] nums) {
        int val=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            val+=nums[i];
            sum+=(i+1);
        }
        return sum-val;
    }
}
