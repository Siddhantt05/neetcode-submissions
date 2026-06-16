class obj{
    int val;
    int key;
    obj(int ke , int va ){
     key =ke;
       val=va;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<obj> pq = new PriorityQueue<>((a, b) -> Integer.compare(b.val, a.val)); 
        for(int t : nums){
            map.put(t,map.getOrDefault(t,0)+1);
        }
        for(int key : map.keySet()){
            pq.add(new obj(key,map.get(key)));
        }
        int [] ans = new int[k];
        for(int i=0;i<ans.length;i++){
            ans[i]=pq.poll().key;
        }
        return ans;
    }
}
