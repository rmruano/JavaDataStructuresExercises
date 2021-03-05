package com.rubenmoraleda.data_structures_exercises;

public class DoubleLinkedList {

    public static class Node {
        protected Node prev = null;
        protected Node next = null;
        public String value;
        public String key;
        protected DoubleLinkedList linkedList = null;

        public Node(String key, String value) {
            this.value = value;
            this.key = key;
        }

        public Node setLinkedList(DoubleLinkedList linkedList) {
            this.linkedList = linkedList;
            return this;
        }

        public Node unlink() {
            if (linkedList.head==this) {
                linkedList.head=next;
            }
            if (prev!=null) {
                prev.next = next;
            }
            if (next!=null) {
                next.prev = prev;
            }
            this.prev = null;
            this.next = null;
            this.linkedList = null;
            return this;
        }

        /** Performs iteration, we're not storing a pointer to the last node */
        public Node travelToLastNode() {
            if (next!=null) {
                Node currentNode = next;
                while (currentNode.next != null) {
                    currentNode = currentNode.next;
                }
                return currentNode;
            } else {
                return this;
            }
        }
    }

    protected Node head = null;

    public Node getHead() {
        return head;
    }

    public DoubleLinkedList append(Node node) {
        node.setLinkedList(this);
        if (head==null) {
            head = node;
        } else {
            Node lastNode = head.travelToLastNode();
            node.prev = lastNode;
            lastNode.next = node;
        }
        return this;
    }

    public DoubleLinkedList prepend(Node node) {
        node.setLinkedList(this);
        if (head!=null) {
            node.prev = null;
            node.next = head;
            head.prev = node;
            head = node;
        }
        head = node;
        return this;
    }

    public Node getByKey(String key) {
        Node currentNode = head;
        while(currentNode!=null) {
            if (currentNode.key.equals(key)) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    /** Performs iteration */
    public Node travelToLastNode() {
        if (head!=null) return head.travelToLastNode();
        return null;
    }

}
