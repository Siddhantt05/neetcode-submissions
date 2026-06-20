class Solution {
    static void rec(int size, String t , int score,List<String> ans){
        if(t.length()==size){
            if(score==0){
              ans.add(new String(t));
              return;
            }
            return;
        }
        if(score<0) return;
        rec(size,t+"(",score+1,ans);
        rec(size,t+")",score-1,ans);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        rec(n*2,"",0,ans);
        return ans;
    }
}
