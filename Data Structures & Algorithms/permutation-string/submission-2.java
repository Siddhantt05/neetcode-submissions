class Solution {
    static boolean check(int [] a , int []b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false;
        int [] c1 = new int[26];
        int index_sum=0;
        for(char t:s1.toCharArray()) {
            c1[t-'a']+=1;
            index_sum+=(t-'a');
        }
        int [] c2=  new int[26];
        int index_sum2=0;
        for(int i=0;i<s1.length();i++){
            c2[s2.charAt(i)-'a']+=1;
            index_sum2+=(s2.charAt(i)-'a');
        }
        // sliding window

        for(int i=0;i<=s2.length()-s1.length();i++){
            if(i==0){
                if( index_sum==index_sum2 && check(c1,c2) ) return true;
            }
            else{
                index_sum2-=(s2.charAt(i-1)-'a');
                c2[s2.charAt(i-1)-'a']-=1;
                c2[s2.charAt(i+s1.length()-1)-'a']+=1;
                index_sum2+=(s2.charAt(i+s1.length()-1)-'a');
                if(index_sum==index_sum2 && check(c1,c2) ) return true;
            }
        }

return false;
    }
}
