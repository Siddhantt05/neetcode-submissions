class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map =new HashMap<>();
        for(String t : strs){
            char [] arr = t.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(map.containsKey(key)){
                map.get(key).add(t);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(t);
                map.put(key, list);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(String t : map.keySet()) ans.add(map.get(t));
        return ans;
    }
}
