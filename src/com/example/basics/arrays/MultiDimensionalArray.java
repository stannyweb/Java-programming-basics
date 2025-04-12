package com.example.basics.arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        // Declare a 2-dimensional array (a matrix) of integers with 3 rows and 4 columns.
        int[][] matrix = new int[3][4];

        // Assign values to the elements of the 'matrix' array using row and column indices.
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;
        matrix[1][0] = 5;
        matrix[1][1] = 6;
        matrix[1][2] = 7;
        matrix[1][3] = 8;
        matrix[2][0] = 9;
        matrix[2][1] = 10;
        matrix[2][2] = 11;
        matrix[2][3] = 12;

        // Access and print the elements of the 'matrix' array using nested for loops.
        System.out.println("Elements of the 'matrix' array:");
        for (int i = 0; i < matrix.length; i++) { // Iterate through rows
            for (int j = 0; j < matrix[i].length; j++) { // Iterate through columns of the current row
                System.out.print(matrix[i][j] + "\t"); // Print the element followed by a tab
            }
            System.out.println(); // Move to the next line after printing all columns of a row
        }

        System.out.println();

        // Another way to declare and initialize a 2-dimensional array with values directly.
        int[][] anotherMatrix = {
                {13, 14, 15},       // First row
                {16, 17, 18, 19},   // Second row (can have a different length)
                {20, 21}            // Third row (can have a different length)
        };

        // Print the elements of the 'anotherMatrix' array.
        System.out.println("Elements of the 'anotherMatrix' array:");
        for (int i = 0; i < anotherMatrix.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < anotherMatrix[i].length; j++) {
                System.out.print(anotherMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        // Example of a 3-dimensional array.
        int[][][] cube = new int[2][3][4]; // 2 blocks, 3 rows, 4 columns

        // Assign a value to a specific element in the 3D array.
        cube[0][1][2] = 100;

        System.out.println("Element at cube[0][1][2]: " + cube[0][1][2]); // Output: 100

        System.out.println();

        // Iterate through the 3D array and print some elements.
        System.out.println("Some elements of the 'cube' array:");
        for (int i = 0; i < cube.length; i++) {
            System.out.println("Block " + i + ":");
            for (int j = 0; j < cube[i].length; j++) {
                System.out.print("  Row " + j + ": ");
                for (int k = 0; k < cube[i][j].length; k++) {
                    System.out.print(cube[i][j][k] + "\t");
                }
                System.out.println();
            }
        }
    }
}
