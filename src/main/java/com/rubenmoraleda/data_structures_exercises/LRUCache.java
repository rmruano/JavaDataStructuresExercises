package com.rubenmoraleda.data_structures_exercises;

import com.rubenmoraleda.data_structures_exercises.DoubleLinkedList.Node;
import java.util.HashMap;

public class LRUCache {

    protected int capacity;
    protected DoubleLinkedList linkedList;
    protected HashMap<String, Node> hashmap;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.linkedList = new DoubleLinkedList();
        this.hashmap = new HashMap<String, Node>();
    }

    public Node getOldestNode() {
        return linkedList.head;
    }

    public int getCurrentSize() {
        return hashmap.size();
    }

    protected void destroyOldestNode() {
        Node node = linkedList.head;
        if (node!=null) {
            node.unlink();
            if (hashmap.containsKey(node.key)) {
                hashmap.remove(node.key);
            }
        }
    }

    public LRUCache put(String key, String value) {
        if (hashmap.containsKey(key)) {
            hashmap.get(key).unlink();
            hashmap.remove(key);
        }
        if (hashmap.size()>=capacity) {
            destroyOldestNode();
        }
        Node node = new Node(key, value);
        linkedList.append(node);
        hashmap.put(key, node);
        return this;
    }

    public Node get(String key) {
        if (hashmap.containsKey(key)) {
            Node node = hashmap.get(key);
            node.unlink(); // Remove links but keeping linked nodes linked between themselves
            linkedList.append(node); // Append the node again at the last of the queue (do a touch)
            return node;
        }
        return null;
    }

}
