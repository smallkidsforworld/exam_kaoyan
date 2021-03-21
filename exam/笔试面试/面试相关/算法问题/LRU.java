import java.security.Key;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRU<K, V> extends LinkedHashMap<K, V> {
    private static final int MAX_SIZE = 3;

    public LRU() {
        super(MAX_SIZE, 0.75f, true);
    }

    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
        // TODO Auto-generated method stub
        return size() > MAX_SIZE;
    }

}

class LRUCache<K, V> {
    class Node<K, V> {
        Node after, before;
        K key;
        V val;
    }

    private static final int MAX_SIZE = 10;

    private int capacity;
    private Node first, tail;
    private Map<K, Node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
    }

    public V get(K k) {
        Node node = map.get(k);
        if (node == null)
            return null;
        moveToHead(node);
        return node.val;
    }

    public void put(K k, V v) {
        Node node = new Node();
        node.val = V;
        node.key = Key;
        map.put(k, n);
        addToHead(node);
    }

    public void moveToHead(Node node) {
        if (node == first) {
            return;
        } else if (node == tail) {
            tail = tail.before;
            tail.after = null;
        } else {
            node.before.after = node.next;
            node.after.before = node.before;
        }
        node.before = first.before;
        node.after = first;
        first.before = node;
        first = node;
    }

    public void addToHead(Node node) {
        if (map.isEmpty()) {
            first = node;
            tail = node;
            return;
        }
        if (size() >= LRUCache.MAX_SIZE) {
            removeLast();
        }
        node.after = first;
        first.before = node;
        first = node;
    }

    private void removeLast() {
        map.remove(last.key);
        Node preNode = last.before;
        if (preNode != null) {
            preNode.next = null;
            last = preNode;
        }
    }

    public int size() {
        return this.capacity;
    }

}