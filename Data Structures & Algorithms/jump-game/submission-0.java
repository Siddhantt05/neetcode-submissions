class Solution {
    static boolean rec(int []nums,int index){
        if(index>=nums.length-1) return true;
        if(nums[index]==0) return false;
      boolean ans=false;
        for(int i=1;i<=nums[index];i++){
            ans=ans|| rec(nums, index+i);
        }  
        return ans;
    }
    public boolean canJump(int[] nums) {
        return rec(nums,0);
    }
}
