package com.rubenmoraleda.data_structures_exercises;
import junit.framework.TestCase;

public class LRUCacheTest extends TestCase {

    LRUCache lruCache;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        lruCache = new LRUCache(5);
        lruCache.put("test-1","value 1");
        lruCache.put("test-2","value 2");
        lruCache.put("test-3","value 3");
        lruCache.put("test-4","value 4");
    }

    public void testCurrentSize() {
        assertEquals(4, lruCache.getCurrentSize());
    }

    public void testGet() {
        assertEquals("test-1", lruCache.get("test-1").key);
        assertEquals("value 1", lruCache.get("test-1").value);
    }

    public void testPurgeOldCaches() {
        lruCache.put("test-5","value 5");
        lruCache.put("test-6","value 6"); // This will exceed the capacity and test-1 will be destroyed
        assertEquals(5, lruCache.getCurrentSize());
        assertEquals("test-2", lruCache.getOldestNode().key);
        lruCache.put("test-2","value 2b"); // Putting test-2 key again must not destroy test-3 (because we're not exceeding the capacity, the item it's already there)
        assertEquals("test-3", lruCache.getOldestNode().key);
        lruCache.put("test-7","value 7"); // This will exceed the capacity and test-3 will be destroyed
        assertNotSame("test-3", lruCache.getOldestNode().key);
        assertEquals(5, lruCache.getCurrentSize());
    }



}
