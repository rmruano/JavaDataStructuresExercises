package com.rubenmoraleda.data_structures_exercises;

import junit.framework.TestCase;

public class RotateMatrixTest extends TestCase {

    public void testRotate2x2Matrix() {
        RotateMatrix.Matrix matrix = new RotateMatrix.Matrix(2);
        matrix.matrix[0] = new int[]{0, 1};
        matrix.matrix[1] = new int[]{2, 3};
        matrix.rotateNotInPlace();

        assertEquals(2, matrix.matrix[0][0]);
        assertEquals(0, matrix.matrix[0][1]);
        assertEquals(3, matrix.matrix[1][0]);
        assertEquals(1, matrix.matrix[1][1]);
    }

    public void testRotateInPlace2x2Matrix() {
        RotateMatrix.Matrix matrix = new RotateMatrix.Matrix(2);
        matrix.matrix[0] = new int[]{0, 1};
        matrix.matrix[1] = new int[]{2, 3};
        matrix.rotateInPlace();

        assertEquals(2, matrix.matrix[0][0]);
        assertEquals(0, matrix.matrix[0][1]);
        assertEquals(3, matrix.matrix[1][0]);
        assertEquals(1, matrix.matrix[1][1]);
    }

    public void testRotate3x3Matrix() {
        RotateMatrix.Matrix matrix = new RotateMatrix.Matrix(3);
        matrix.matrix[0] = new int[]{0, 1, 2};
        matrix.matrix[1] = new int[]{3, 4, 5};
        matrix.matrix[2] = new int[]{6, 7, 8};
        matrix.rotateNotInPlace();

        assertEquals(6, matrix.matrix[0][0]);
        assertEquals(3, matrix.matrix[0][1]);
        assertEquals(0, matrix.matrix[0][2]);
        assertEquals(7, matrix.matrix[1][0]);
        assertEquals(4, matrix.matrix[1][1]);
        assertEquals(1, matrix.matrix[1][2]);
        assertEquals(8, matrix.matrix[2][0]);
        assertEquals(5, matrix.matrix[2][1]);
        assertEquals(2, matrix.matrix[2][2]);
    }

    public void testRotateInPlace3x3Matrix() {
        RotateMatrix.Matrix matrix = new RotateMatrix.Matrix(3);
        matrix.matrix[0] = new int[]{0, 1, 2};
        matrix.matrix[1] = new int[]{3, 4, 5};
        matrix.matrix[2] = new int[]{6, 7, 8};
        matrix.rotateInPlace();

        assertEquals(6, matrix.matrix[0][0]);
        assertEquals(3, matrix.matrix[0][1]);
        assertEquals(0, matrix.matrix[0][2]);
        assertEquals(7, matrix.matrix[1][0]);
        assertEquals(4, matrix.matrix[1][1]);
        assertEquals(1, matrix.matrix[1][2]);
        assertEquals(8, matrix.matrix[2][0]);
        assertEquals(5, matrix.matrix[2][1]);
        assertEquals(2, matrix.matrix[2][2]);
    }

    public void testRotate4x4Matrix() {
        RotateMatrix.Matrix matrix = new RotateMatrix.Matrix(4);
        matrix.matrix[0] = new int[]{0, 1, 2, 3};
        matrix.matrix[1] = new int[]{4, 5, 6, 7};
        matrix.matrix[2] = new int[]{8, 9, 0, 1};
        matrix.matrix[3] = new int[]{2, 3, 4, 5};
        matrix.rotateNotInPlace();

        assertEquals(2, matrix.matrix[0][0]);
        assertEquals(8, matrix.matrix[0][1]);
        assertEquals(4, matrix.matrix[0][2]);
        assertEquals(0, matrix.matrix[0][3]);
        assertEquals(3, matrix.matrix[1][0]);
        assertEquals(9, matrix.matrix[1][1]);
        assertEquals(5, matrix.matrix[1][2]);
        assertEquals(1, matrix.matrix[1][3]);
        assertEquals(4, matrix.matrix[2][0]);
        assertEquals(0, matrix.matrix[2][1]);
        assertEquals(6, matrix.matrix[2][2]);
        assertEquals(2, matrix.matrix[2][3]);
        assertEquals(5, matrix.matrix[3][0]);
        assertEquals(1, matrix.matrix[3][1]);
        assertEquals(7, matrix.matrix[3][2]);
        assertEquals(3, matrix.matrix[3][3]);
    }

    public void testRotateInPlace4x4Matrix() {
        RotateMatrix.Matrix matrix = new RotateMatrix.Matrix(4);
        matrix.matrix[0] = new int[]{0, 1, 2, 3};
        matrix.matrix[1] = new int[]{4, 5, 6, 7};
        matrix.matrix[2] = new int[]{8, 9, 0, 1};
        matrix.matrix[3] = new int[]{2, 3, 4, 5};
        matrix.rotateInPlace();

        assertEquals(2, matrix.matrix[0][0]);
        assertEquals(8, matrix.matrix[0][1]);
        assertEquals(4, matrix.matrix[0][2]);
        assertEquals(0, matrix.matrix[0][3]);
        assertEquals(3, matrix.matrix[1][0]);
        assertEquals(9, matrix.matrix[1][1]);
        assertEquals(5, matrix.matrix[1][2]);
        assertEquals(1, matrix.matrix[1][3]);
        assertEquals(4, matrix.matrix[2][0]);
        assertEquals(0, matrix.matrix[2][1]);
        assertEquals(6, matrix.matrix[2][2]);
        assertEquals(2, matrix.matrix[2][3]);
        assertEquals(5, matrix.matrix[3][0]);
        assertEquals(1, matrix.matrix[3][1]);
        assertEquals(7, matrix.matrix[3][2]);
        assertEquals(3, matrix.matrix[3][3]);
    }

}