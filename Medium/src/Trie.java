/**
 * LeetCode 208.实现Trie（前缀树）
 * Implement Trie (Prefix Tree)
 */
public class Trie {
    private Trie[] child;
    private boolean end;

    public Trie() {
        child = new Trie[26];
        end = false;
    }

    public void insert(String word) {
        Trie node = this;
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            int index = character-'a';
            if (node.child[index] == null) {
                node.child[index] = new Trie();
            }

            node = node.child[index];
        }

        node.end = true;
    }

    public boolean search(String word) {
        Trie node = searchPrefix(word);

        if (node != null && node.end) {
            return true;
        }

        return false;
    }

    public boolean startsWith(String prefix) {
        Trie node = searchPrefix(prefix);

        if (node != null) {
            return true;
        }

        return false;
    }

    private Trie searchPrefix(String prefix) {
        Trie node = this;
        for (int i = 0; i < prefix.length(); i++) {
            char character = prefix.charAt(i);
            int index = character-'a';
            if (node.child[index] == null) {
                return null;
            }

            node = node.child[index];
        }

        return node;
    }
}
