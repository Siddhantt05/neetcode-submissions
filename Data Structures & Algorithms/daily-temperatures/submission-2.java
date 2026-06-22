class pair{
    int val;
    int index;
    pair(int va , int ind ){
        val = va;
        index=ind;
    }
}
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int [] ans  =new int[temp.length]; 
         Stack<pair> st = new Stack<>();
         for(int i=temp.length-1;i>=0;i--){
            pair t = new pair(temp[i],i);
            if(st.isEmpty()){
                st.push(t);
                ans[i]=0;
            }
            else{
                while(!st.isEmpty() && st.peek().val<=temp[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    st.push(t);
                    ans[i]=0;
                }
                else{
                    ans[i]=st.peek().index-i;
                    st.push(t);
                }
            }
         }
         return ans;
    }
}
   