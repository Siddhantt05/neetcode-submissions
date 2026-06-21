class Solution {
    public boolean isValid(String s) {
     Stack<Character> st = new Stack<>();
     for(char t : s.toCharArray()){
        if(t=='('||t=='{'||t=='[')st.push(t);
        else{
            if(t==')'){
                if(  !st.isEmpty() && st.peek()=='(') st.pop();
                else return false;
            }
             if(t=='}'){
                if(  !st.isEmpty()&& st.peek()=='{') st.pop();
                else return false;
            }
             if(t==']'){
                if(!st.isEmpty() && st.peek()=='[') st.pop();
                else return false;
            }
        }
     }
     return st.isEmpty(); 
    }
}
