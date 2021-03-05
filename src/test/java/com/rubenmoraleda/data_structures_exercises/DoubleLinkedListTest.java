package com.rubenmoraleda.data_structures_exercises;

import junit.framework.TestCase;
import com.rubenmoraleda.data_structures_exercises.DoubleLinkedList.Node;

public class DoubleLinkedListTest extends TestCase {

    DoubleLinkedList doubleLinkedList;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.append(new Node("test-1","test 1"));
        doubleLinkedList.append(new Node("test-2","test 2"));
        doubleLinkedList.append(new Node("test-3","test 3"));
    }

    public void testAppend() {
        assertEquals("test 1", doubleLinkedList.getHead().value);
        assertEquals(doubleLinkedList, doubleLinkedList.getHead().linkedList);
    }

    public void testPrepend() {
        doubleLinkedList.prepend(new Node("test-2","test 2"));
        doubleLinkedList.prepend(new Node("test-3","test 3"));
        assertEquals("test 3", doubleLinkedList.getHead().value);
    }

    public void testGetLastNode() {
        assertEquals("test 3", doubleLinkedList.travelToLastNode().value);
    }

    public void testGetByKey() {
        assertEquals("test 1", doubleLinkedList.getByKey("test-1").value);
        assertEquals("test 2", doubleLinkedList.getByKey("test-2").value);
        assertEquals("test 3", doubleLinkedList.getByKey("test-3").value);
        assertNull(doubleLinkedList.getByKey("test-4"));
    }

    public void testUnlink() {
        assertEquals("test 1", doubleLinkedList.getByKey("test-1").value);
        Node unlinkedNode = doubleLinkedList.getByKey("test-2").unlink();
        assertNull(unlinkedNode.prev);
        assertNull(unlinkedNode.next);
        assertEquals("test 3", doubleLinkedList.travelToLastNode().value);
        Node unlinkedNode2 = doubleLinkedList.getByKey("test-1").unlink();
        assertEquals("test 3", doubleLinkedList.getHead().value);
        doubleLinkedList.getByKey("test-3").unlink();
        assertNull(doubleLinkedList.getHead());
        doubleLinkedList.append(new Node("test-3","test 3"));
        doubleLinkedList.prepend(new Node("test-4","test 4"));
        doubleLinkedList.travelToLastNode().unlink();
        assertEquals("test 4", doubleLinkedList.getHead().value);
    }
}