class Solution {
    static void rec(int [] nums,  int target , List<List<Integer>> ans,List<Integer> tem , int index){
        if(index>=nums.length){
            if(target==0){
                ans.add(new ArrayList<>(tem));
                return;
            }
            return;
        }
        if(target<0) return;
        tem.add(nums[index]);
        rec(nums,target-nums[index],ans,tem,index);
        tem.remove(tem.size()-1);
        rec(nums,target,ans,tem,index+1);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tem = new ArrayList<>();
        rec(nums,target,ans,tem,0);
        return ans;
    }
}
