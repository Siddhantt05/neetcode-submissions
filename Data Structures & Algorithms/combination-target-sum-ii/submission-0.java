class Solution {
    static void rec(int[] arr , int t , int i , List<Integer> tem ,  List<List<Integer>> ans){
        if(t==0){
            ans.add(new ArrayList<>(tem));
            return;
        }
       for(int index = i;index<arr.length;index++){
        if(index>i && arr[index]==arr[index-1])continue;
        if(arr[index]<=t){
            tem.add(arr[index]);
            rec(arr,t-arr[index],index+1,tem,ans);
            tem.remove(tem.size()-1);
           
        }
       }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tem= new ArrayList<>();
        rec(candidates,target , 0 ,tem , ans);
        return ans;
    }
}
