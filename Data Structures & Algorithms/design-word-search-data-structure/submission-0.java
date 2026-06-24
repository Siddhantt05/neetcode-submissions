class Node {
    Node[] children;
    boolean eow;

    Node() {
        children = new Node[26];
        eow = false;
    }
}

class WordDictionary {
    static Node root;

    public WordDictionary() {
        root = new Node();
    }

    public void addWord(String word) {
        Node tem = root;

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';

            if (tem.children[index] == null) {
                tem.children[index] = new Node();
            }

            tem = tem.children[index];
        }

        tem.eow = true;
    }

    private boolean dfs(String word, int idx, Node node) {
        if (idx == word.length()) {
            return node.eow;
        }

        char ch = word.charAt(idx);

        if (ch == '.') {
            for (Node child : node.children) {
                if (child != null && dfs(word, idx + 1, child)) {
                    return true;
                }
            }
            return false;
        }

        int index = ch - 'a';

        if (node.children[index] == null) {
            return false;
        }

        return dfs(word, idx + 1, node.children[index]);
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }
}