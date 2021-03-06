package com.rubenmoraleda.data_structures_exercises;

import junit.framework.TestCase;

public class RotateMatrixTest extends TestCase {

    public void testRotate2x2Matrix() {
        RotateMatrix.Matrix matrix = new RotateMatrix.Matrix(2);
        matrix.matrix[0] = new int[]{0, 1};
        matrix.matrix[1] = new int[]{2, 3};
        matrix.rotateNotInPlace();

        assertEquals(matrix.matrix[0][0], 2);
        assertEquals(matrix.matrix[0][1], 0);
        assertEquals(matrix.matrix[1][0], 3);
        assertEquals(matrix.matrix[1][1], 1);
    }

    public void testRotate3x3Matrix() {
        RotateMatrix.Matrix matrix = new RotateMatrix.Matrix(3);
        matrix.matrix[0] = new int[]{0, 1, 2};
        matrix.matrix[1] = new int[]{3, 4, 5};
        matrix.matrix[2] = new int[]{6, 7, 8};
        matrix.rotateNotInPlace();

        assertEquals(matrix.matrix[0][0], 6);
        assertEquals(matrix.matrix[0][1], 3);
        assertEquals(matrix.matrix[0][2], 0);
        assertEquals(matrix.matrix[1][0], 7);
        assertEquals(matrix.matrix[1][1], 4);
        assertEquals(matrix.matrix[1][2], 1);
        assertEquals(matrix.matrix[2][0], 8);
        assertEquals(matrix.matrix[2][1], 5);
        assertEquals(matrix.matrix[2][2], 2);
    }

}