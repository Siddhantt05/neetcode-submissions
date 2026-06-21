class Solution {
    public int maxArea(int[] he) {
        int i=0;
        int j=he.length-1;
        int ans=0;
        while(i<j){
            if(he[i]<he[j]){
                ans=Math.max(ans,Math.min(he[i],he[j])*(j-i));
                i++;
            }
            else  if(he[i]>he[j]){
                ans=Math.max(ans,Math.min(he[i],he[j])*(j-i));
                j--;
            }
            else {
                ans=Math.max(ans,Math.min(he[i],he[j])*(j-i));
                i++;
                j--;
            }
        }
        return ans;
    }
}
