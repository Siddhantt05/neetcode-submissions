class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        int i=0;
        int j=0;
        int minsize = Integer.MAX_VALUE;
        int start_i=0;
        int req =t.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char  a : t.toCharArray()) map.put(a,map.getOrDefault(a,0)+1);
        while(j<s.length()){
            char a = s.charAt(j);
            if(map.containsKey(a) && map.get(a)>0){
                req--;
            }
            map.put(a,map.getOrDefault(a,0)-1);
            while(req==0){
                int size = j-i+1;
                if(minsize>size){
                    minsize= size;
                    start_i=i;
                }
                char startChar  = s.charAt(i);
                map.put(startChar,map.getOrDefault(startChar,0)+1);
                if(map.get(startChar)>0)req++;
                i++;
            }
            j++;
           
        }
        return minsize==Integer.MAX_VALUE?"":s.substring(start_i,minsize+start_i);
    }
}
