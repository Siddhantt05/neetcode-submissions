class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder st = new StringBuilder();
        StringBuilder a = new StringBuilder();
        for(char t :s.toCharArray()){
            if(t!=' ' && t>='A' && t<='Z' || t>='a' && t<='z' || t>='0' && t<='9'){
            char app = Character.toLowerCase(t);
            st.append(app);
            }
        }
        System.out.println(st.toString());
        a.append(st.toString());
        st.reverse();
         System.out.println(st.toString());
        return st.toString().equals(a.toString());
    }
}
