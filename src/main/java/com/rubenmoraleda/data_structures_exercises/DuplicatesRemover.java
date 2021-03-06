package com.rubenmoraleda.data_structures_exercises;

/**
 * Remove duplicates on a given sorted array.
 *
 * Expected output
 * {1, 1, 2} => {1, 2, 2} length 2
 * {1, 2, 2, 4, 4, 6} => {1, 2, 4, 6, 4, 6} length 4
 *
 * Do not generate a new array
 */
public class DuplicatesRemover {

    public int process(int[] array) {
        int length = array.length;
        if (length==0) return 0;
        int writeIdx = 0;
        for(int readIdx=0; readIdx<array.length; readIdx++) {
            if (readIdx == 0 || array[writeIdx-1]!=array[readIdx]) {
                array[writeIdx] = array[readIdx];
                writeIdx++;
            } else {
                length--;
            }
        }
        return length;
    }

}
