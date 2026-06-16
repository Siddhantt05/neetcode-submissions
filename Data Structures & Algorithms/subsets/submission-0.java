
class Solution {
    static void rec(List<Integer> lt,List<List<Integer>> ans,int [] nums,  int index){
        if(index>=nums.length){
            ans.add(new ArrayList<>(lt));
            return;
        }
        lt.add(nums[index]);
        rec(lt,ans,nums,index+1);
        lt.remove(lt.size()-1);
        rec(lt,ans,nums,index+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> lt = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        rec(lt,ans,nums,0);
        return ans;
    }
}
