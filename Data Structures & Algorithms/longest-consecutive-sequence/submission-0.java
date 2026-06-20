class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> Set=new HashSet<>();
        for(int num:nums){
            Set.add(num);
        }
        int n=0;
        for(int num:nums){
            if(!Set.contains(num-1)){
                int current=num;
                int l=1;
                while(Set.contains(current+1)){
                    current=current +1;
                    l=l+1;
                }
                n=Math.max(l,n);
            }
        }
        return n;
    }
}