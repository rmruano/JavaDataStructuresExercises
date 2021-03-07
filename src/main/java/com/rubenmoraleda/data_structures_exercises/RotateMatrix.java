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

        /**
         * Swaps the axis and negates the Y
         * @param x coordinate
         * @param y coordinate
         * @param w matrix width
         * @param h matrix height
         * @return
         */
        protected int[] getRotatedCoordinates(int x, int y, int w, int h) {
            int[] rotatedCoords = new int[2];
            rotatedCoords[0] = w-y-1;
            rotatedCoords[1] = x;
            return rotatedCoords;
        }

        /**
         * Rotate the matrix easily by creating a new matrix.
         * It iterates through the whole matrix to get the new value for each cell.
         */
        public void rotateNotInPlace() {
            int w = matrix.length;
            int h = matrix[0].length;
            int ret[][] = new int[w][h];
            // Swap the axis and negate the Y (iterate from the end)
            for(int i=0; i<w; i++) {
                for (int j=0; j<h; j++) {
                    int[] rotatedCoords = getRotatedCoordinates(i, j, w, h);
                    ret[i][j] = matrix[rotatedCoords[0]][rotatedCoords[1]];
                }
            }
            matrix = ret;
        }

        /**
         * Rotate the matrix without creating a new one.
         * We'll do that by rotating the 4 positions (360 deg) in place simultaneously.
         * Therefore, the iterations must be performed only on top-left 1/4th of the matrix, the other 3/4ths will be
         * rotated automatically. Please notice that the Y axis max value must be smaller than the X axis max.
         */
        public void rotateInPlace() {
            int w = matrix.length;
            int h = matrix[0].length;
            int[] rotatedCoords1, rotatedCoords2, rotatedCoords3, values = new int[4];
            // Swap the axis and negate the Y (iterate from the end)
            for(int i=0, iMax=(int)Math.ceil((double)w/2D); i<iMax; i++) {
                for (int j=0, jMax=(int)Math.floor((double)h/2D); j<jMax; j++) {
                    // Get the 4 positions (360 deg) indices
                    rotatedCoords1 = getRotatedCoordinates(i, j, w, h);
                    rotatedCoords2 = getRotatedCoordinates(rotatedCoords1[0], rotatedCoords1[1], w, h);
                    rotatedCoords3 = getRotatedCoordinates(rotatedCoords2[0], rotatedCoords2[1], w, h);
                    values = new int[4];
                    // Get the values of that positions
                    values[0] = matrix[rotatedCoords1[0]][rotatedCoords1[1]];
                    values[1] = matrix[rotatedCoords2[0]][rotatedCoords2[1]];
                    values[2] = matrix[rotatedCoords3[0]][rotatedCoords3[1]];
                    values[3] = matrix[i][j];
                    // Store them rotated 90 degrees
                    matrix[i][j] = values[0];
                    matrix[rotatedCoords1[0]][rotatedCoords1[1]] = values[1];
                    matrix[rotatedCoords2[0]][rotatedCoords2[1]] = values[2];
                    matrix[rotatedCoords3[0]][rotatedCoords3[1]] = values[3];
                }
            }
        }
    }

}
