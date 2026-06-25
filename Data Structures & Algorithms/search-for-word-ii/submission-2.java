class Solution {
    static class Node {
        Node[] children;
        boolean eow;

        Node() {
            children = new Node[26];
            eow = false;
        }
    }

    static Node root;

    static void insert(String[] words) {
        for (String word : words) {
            Node temp = root;
            for (int i = 0; i < word.length(); i++) {
                int idx = word.charAt(i) - 'a';
                if (temp.children[idx] == null)
                    temp.children[idx] = new Node();
                temp = temp.children[idx];
            }
            temp.eow = true;
        }
    }

    static void rec(char[][] board, int i, int j, Node curr, List<String> ans, String t) {

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == '.')
            return;

        int idx = board[i][j] - 'a';

        if (curr.children[idx] == null)
            return;

        curr = curr.children[idx];
        t += board[i][j];

        if (curr.eow) {
            ans.add(t);
            curr.eow = false; // avoid duplicates
        }

        char ch = board[i][j];
        board[i][j] = '.';

        rec(board, i + 1, j, curr, ans, t);
        rec(board, i - 1, j, curr, ans, t);
        rec(board, i, j + 1, curr, ans, t);
        rec(board, i, j - 1, curr, ans, t);

        board[i][j] = ch;
    }

    public List<String> findWords(char[][] board, String[] words) {

        root = new Node();
        insert(words);

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                rec(board, i, j, root, ans, "");
            }
        }

        return ans;
    }
}