package com.rubenmoraleda.data_structures_exercises;

/**
 * Get the Fibonacci sequence Nth number
 * n0=0, n1=1, n2=1, n3=2, n4=3, n5=5, n6=8, n7=13 ...
 */
public class Fibonacci {

    public long get(int n) {
        if (n<0) return -1L;
        if (n==0) return 0L;
        long[] pair = new long[2];
        pair[1] = 0L;
        pair[0] = 1L;
        long pairSum;
        for(int i=1; i<n; i++) {
            pairSum = pair[0]+pair[1];
            pair[1] = pair[0];
            pair[0] = pairSum;
        }
        return pair[0];
    }

}
