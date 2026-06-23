class Solution {
    static int sum(int n){
        int ans=0;
        while(n!=0){
            int a = n%10;
            a=a*a;
            ans+=a;
            n=n/10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        Set<Integer> st = new HashSet<>();
        while(true){
            if(n==1) return true;
            if(st.contains(n)) return false;
            st.add(n);
            n=sum(n);

        }
       
    }
}
