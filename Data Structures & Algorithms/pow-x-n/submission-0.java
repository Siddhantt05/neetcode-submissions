class Solution {
    static double fun(double x, int n){
        if(n==1) return x;
        double ans=  fun(x,n/2);
        if(n%2==0) return ans*ans;
        else return x*ans*ans;
    }
    public double myPow(double x, int n) {
        if(n==0) return (double)1;
        if(n<0){
            x=1/x;
            n=-n;
        }
        return fun(x,n);
    }
}
