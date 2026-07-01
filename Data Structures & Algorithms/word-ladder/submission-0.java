class Solution {
    static List<String> get(String word, HashSet<String> st) {
        List<String> ft = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            for (char j = 'a'; j <= 'z'; j++) {
                if (j == word.charAt(i)) {
                    continue;
                }
                String newWord = word.substring(0, i) + j + word.substring(i + 1, word.length());
                if (st.contains(newWord)) {
                    ft.add(newWord);
                }
            }
        }
        return ft;
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> st = new HashSet<>(wordList);
        if (!st.contains(endWord)) {
            return 0;
        }
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        if(st.contains(beginWord)) st.remove(beginWord);
        int ans = 0;
        while (!q.isEmpty()) {
            int s = q.size();
            for (int i = 0; i < s; i++) {
                String tem = q.poll();
                if (tem.equals(endWord)) {
                    return ans + 1;
                }
                List<String> lt = get(tem, st);
                for (String t : lt) {
                    if (st.contains(t)) {
                        q.add(t);
                        st.remove(t);
                    }
                }

            }
            ans++;
        }
        return 0;

    }
}