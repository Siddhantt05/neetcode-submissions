class Solution {
    static boolean check(String a){
        if(a.length()==1) return true;
        StringBuilder st = new StringBuilder(a);
       return a.equals(st.reverse().toString());
    }
    static void rec(List<List<String>> ans,List<String> tem,int i , int j ,String s){
       if(i==s.length()){
        ans.add(new ArrayList<>(tem));
        return;
       }
        for(int a =i+1;a<=s.length();a++){
            if(check(s.substring(i,a))){
                tem.add(s.substring(i,a));
                rec(ans,tem,a,a+1,s);
                tem.remove(tem.size()-1);
            }
        }
    } 
    public List<List<String>> partition(String s) {
        List<String> tem= new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        rec(ans,tem,0,0,s);
        return ans;

    }
}