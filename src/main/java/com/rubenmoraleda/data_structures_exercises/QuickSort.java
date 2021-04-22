package com.rubenmoraleda.data_structures_exercises;

public class QuickSort {

    public static int MAX_ITERATIONS = Integer.MAX_VALUE;
    public enum SORT_TYPE {SORT_ASC, SORT_DESC}

    public static int[] asc(int[] array) {
        return sort(array, SORT_TYPE.SORT_ASC);
    }

    public static int[] desc(int[] array) {
        return sort(array, SORT_TYPE.SORT_DESC);
    }

    protected static int[] sort(int[] array, SORT_TYPE sortType) {
        if (array.length>1) sortPartition(array, 0, array.length-1, Integer.valueOf(0), sortType);
        return array;
    }

    protected static int sortPartition(int[] array, int lowIdx, int highIdx, Integer iterations, SORT_TYPE sortType) {
        int length = (highIdx-lowIdx)+1;
        if (length<2 || iterations>=MAX_ITERATIONS) return iterations; // No further processing needed

        int tempValue;
        int pivot = array[highIdx]; // Pick last value of the partition as pivot
        int smallIdx = lowIdx-1; // -1 since it will be incremented first

        // ASC SORT: Process every number and write every smaller ones first, the pivot is processed as well. Bigger numbers are automatically moved to the right side
        // DESC SORT: Process every number and write every bigger ones first, the pivot is processed as well. Smaller numbers are automatically moved to the right side
        for (int i=lowIdx; i<=highIdx; i++) {
            if (
                    (array[i] < pivot && sortType == SORT_TYPE.SORT_ASC) || // Lower and ASC sort
                    (array[i] > pivot && sortType == SORT_TYPE.SORT_DESC) || // Bigger and DESC sort
                    i==highIdx
            ) {
                smallIdx++;
                // Swap numbers
                tempValue = array[i];
                array[i] = array[smallIdx];
                array[smallIdx] = tempValue;
            }
        }

        // Recursive processing of both sides
        if ((highIdx-smallIdx)>1) sortPartition(array, smallIdx+1, highIdx, iterations, sortType);
        if ((smallIdx-lowIdx)>1) sortPartition(array, lowIdx, smallIdx-1, iterations, sortType);

        return iterations;
    }


}