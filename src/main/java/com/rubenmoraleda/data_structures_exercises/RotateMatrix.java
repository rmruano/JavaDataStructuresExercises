package com.rubenmoraleda.data_structures_exercises;

/**
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
 * write a method to rotate the image by 90 degrees.
 * Can you do this in place?
 */
public class RotateMatrix {

    public static class Matrix {

        public int[][] matrix;

        public Matrix(int n) {
            matrix = new int[n][n];
        }

        public void rotateNotInPlace() {
            int w = matrix.length;
            int h = matrix[0].length;
            int ret[][] = new int[w][h];
            for(int i=0; i<w; i++) {
                for (int j=0; j<h; j++) {
                    ret[i][j] = matrix[w-j-1][i];
                }
            }
            matrix = ret;
        }
    }

}
