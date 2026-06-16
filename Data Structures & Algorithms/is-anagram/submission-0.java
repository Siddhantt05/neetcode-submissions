class Solution {
    public boolean isAnagram(String s, String g) {
         int [] arr1= new int[26];
         int [] arr2 = new int[26];
         for(char t :s.toCharArray()) arr1[t-'a']+=1;
          for(char t :g.toCharArray()) arr2[t-'a']+=1;
          for(int i=0;i<arr1.length;i++){
            if(arr1[i]==0 && arr2[i]==0) continue;
            if(arr1[i]!=arr2[i]) return false;
          }
          return true;
    }
}
