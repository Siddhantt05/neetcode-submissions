class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count=0;
        int pro=1;
        int [] ans = new int[nums.length];
        Arrays.fill(ans,0);
        for(int t : nums){
            if(t==0){
                count++;
                if(count>1) {
                    
                    return ans;
                }
            }
            else{
                pro=pro*t;
            }
        }
        if(count!=0){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    ans[i]=pro;
                    return ans;
                }
            
            }
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=pro/nums[i];
        }
        return ans;
    }
}  
