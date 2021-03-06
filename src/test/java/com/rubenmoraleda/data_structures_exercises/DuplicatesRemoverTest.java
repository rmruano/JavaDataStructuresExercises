package com.rubenmoraleda.data_structures_exercises;

import junit.framework.TestCase;

import java.util.Arrays;

public class DuplicatesRemoverTest extends TestCase {

    protected DuplicatesRemover _duplicatesRemover;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        _duplicatesRemover = new DuplicatesRemover();
    }

    public void testProcessTiny() {
        int[] array = new int[]{1,1};
        int length = _duplicatesRemover.process(array);
        assertEquals(1, length);
        assertEquals("[1, 1]", Arrays.toString(array));
    }

    public void testProcessSmall() {
        int[] array = new int[]{1,1,2};
        int length = _duplicatesRemover.process(array);
        assertEquals(2, length);
        assertEquals("[1, 2, 2]", Arrays.toString(array));
    }

    public void testProcessLarge() {
        int[] array = new int[]{1,1,2,2,3,4,4,4,4,5,6,6};
        int length = _duplicatesRemover.process(array);
        assertEquals(6, length);
        assertEquals("[1, 2, 3, 4, 5, 6, 4, 4, 4, 5, 6, 6]", Arrays.toString(array));
    }
}