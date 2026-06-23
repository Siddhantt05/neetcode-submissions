class Solution {
    static boolean possible(int [] piles ,  int mid , int h){
        int total=0;
        for(int t : piles){
            total+=(Math.ceil((double)t/(double)mid));
        }
        return total<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
      int right=-1;
      for(int t : piles)right=Math.max(t,right);
      int left=1;
      int ans = Integer.MAX_VALUE;
      while(left<=right){
        int mid = (left+right)/2;
        if(possible(piles,mid,h)){
            ans=Math.min(ans,mid);
            right=mid-1;
        }
        else{
            left=mid+1;
        }

      }
       return ans;
    }
   
}
