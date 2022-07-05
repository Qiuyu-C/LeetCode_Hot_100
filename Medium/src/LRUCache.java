import java.util.HashMap;

/**
 * LeetCode 146.LRU缓存（最近高频）
 * LRU Cache
 */
public class LRUCache {
    class DLinkedNode {
        int key;
        int value;
        DLinkedNode prev;
        DLinkedNode next;
        public DLinkedNode() {

        }

        public DLinkedNode(int key, int value) {
            this.key = key; this.value = value;
        }
    }

    HashMap<Integer, DLinkedNode> map = new HashMap<>();
    DLinkedNode head;
    DLinkedNode tail;
    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new DLinkedNode();
        tail = new DLinkedNode();

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DLinkedNode target = map.get(key);
        if (target == null) {
            return -1;
        }

        moveToHead(target);

        return target.value;
    }

    public void put(int key, int value) {
        DLinkedNode node = map.get(key);
        if (node == null) {
            DLinkedNode newNode = new DLinkedNode(key, value);
            map.put(key, newNode);
            addToHead(newNode);
            if (map.size() > capacity) {
                DLinkedNode remove = removeTail();
                map.remove(remove.key);
            }
        }
        else {
            node.value = value;
            moveToHead(node);
        }
    }

    private void addToHead(DLinkedNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(DLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    private DLinkedNode removeTail() {
        DLinkedNode remove = tail.prev;
        removeNode(remove);

        return remove;
    }
}
