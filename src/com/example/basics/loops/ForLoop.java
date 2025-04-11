package com.example.basics.loops;

public class ForLoop {

    public static void main(String[] args) {

        // Example 1: Simple for loop to print numbers from 0 to 4
        System.out.println("Example 1: Printing numbers from 0 to 4");
        for (int i = 0; i < 5; i++) {
            System.out.println("The value of i is: " + i);
        }
        System.out.println();

        // Example 2: For loop to iterate through an array
        System.out.println("Example 2: Iterating through an array");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int j = 0; j < numbers.length; j++) {
            System.out.println("Element at index " + j + " is: " + numbers[j]);
        }
        System.out.println();

        // Example 3: Enhanced for loop (for-each loop) for arrays
        System.out.println("Example 3: Enhanced for loop for arrays");
        String[] names = {"Alice", "Bob", "Charlie"};
        for (String name : names) {
            System.out.println("Name: " + name);
        }
        System.out.println();

        // Example 4: For loop with a step of 2
        System.out.println("Example 4: For loop with a step of 2");
        for (int k = 0; k <= 10; k += 2) {
            System.out.println("The value of k is: " + k);
        }
        System.out.println();

        // Example 5: Nested for loops to create a simple pattern
        System.out.println("Example 5: Nested for loops for a pattern");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
