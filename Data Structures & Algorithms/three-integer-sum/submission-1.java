class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int target = -nums[i];
            int j=i+1;
            int k=nums.length-1;
           
            while(j<k){
                 if(nums[j]+nums[k]<target) j++;
                else if(nums[j]+nums[k]>target)k--;
                else{
                
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j+1<nums.length && nums[j]==nums[j+1]) j++;
                    while(k>j && nums[k]==nums[k-1]) k--;
                    j++;
                    k--;
                }
                
            }
        }
        return ans;
    }

    // -4 -1 -1 0 1 2 
}
