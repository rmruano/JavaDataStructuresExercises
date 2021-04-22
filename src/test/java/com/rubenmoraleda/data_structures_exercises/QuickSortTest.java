package com.rubenmoraleda.data_structures_exercises;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSortTest extends TestCase {

    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    public void testSortAsc() {
        int[] list0 = {6};
        int[] list1 = {10,6};
        int[] list2 = {6,1040,10};
        int[] list3 = {6,10,1040,22,52,1,4,7,23,182,729,3,88,25,99};
        int[] list4 = {985,27,40,66,89,111,113,138,159,180,195,212,218,251,266,322,326,347,359,382,391,408,425,435,436,465,525,550,616,622,639,672,696,719,745,756,779,788,809,847,856,887,911,917,921,941,949,976,981,3};
        sortAscTest(list0);
        sortAscTest(list1);
        sortAscTest(list2);
        sortAscTest(list3);
        sortAscTest(list4);
    }

    public void testSortDesc() {
        int[] list0 = {6};
        int[] list1 = {6,10};
        int[] list2 = {6,10,1040};
        int[] list3 = {6,10,1040,22,52,1,4,7,23,182,729,3,88,25,99};
        int[] list4 = {3,27,40,66,89,111,113,138,159,180,195,212,218,251,266,322,326,347,359,382,391,408,425,435,436,465,525,550,616,622,639,672,696,719,745,756,779,788,809,847,856,887,911,917,921,941,949,976,981,985};
        sortDescTest(list0);
        sortDescTest(list1);
        sortDescTest(list2);
        sortDescTest(list3);
        sortDescTest(list4);
    }

    protected void sortAscTest(int[] list) {
        QuickSort.asc(list);
        System.out.println( "ASC sort: "+Arrays.toString(list));
        assertIsSortedAsc(list);
    }

    protected void sortDescTest(int[] list) {
        QuickSort.desc(list);
        System.out.println( "DESC sort: "+Arrays.toString(list));
        assertIsSortedDesc(list);
    }

    protected void assertIsSortedAsc(int[] list) {
        if (list.length<2) return;
        for(int i=1;i<list.length;i++) {
            assertTrue("List not sorted (ASC): list["+i+"] ("+list[i]+") is not greater or equal than list["+(i-1)+"] ("+list[i-1]+")",list[i] >= list[i-1]);
        }
    }

    protected void assertIsSortedDesc(int[] list) {
        if (list.length<2) return;
        for(int i=1;i<list.length;i++) {
            assertTrue("List not sorted (DESC): list["+i+"] ("+list[i]+") is not less or equal than list["+(i-1)+"] ("+list[i-1]+")",list[i] <= list[i-1]);
        }
    }




}
