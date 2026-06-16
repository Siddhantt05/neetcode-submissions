class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int t : nums){
            if(st.contains(t)) return true;
            st.add(t);
        }
        return false;
    }
}