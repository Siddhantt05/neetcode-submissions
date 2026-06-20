class Solution {
    static String [] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static void rec(String digits , int index, List<String> ans , String t ){
        if(index>=digits.length()){
            ans.add(new String(t));
            return;
        }
        int point = digits.charAt(index)-'0';
        System.out.println(point);
        for(char a : map[point].toCharArray()){
            rec(digits,index+1,ans,t+a);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length()==0) return ans;
        rec(digits,0,ans,"");
        return ans;
    }
}
