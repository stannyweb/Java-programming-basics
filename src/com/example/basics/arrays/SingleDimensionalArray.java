package com.example.basics.arrays;

public class SingleDimensionalArray {

    public static void main(String[] args) {

        // Declare an array of integers named 'numbers' with a size of 5.
        int[] numbers = new int[5];

        // Assign values to the elements of the 'numbers' array using their index (starting from 0).
        numbers[0] = 10; // Assign 10 to the first element (index 0)
        numbers[1] = 20; // Assign 20 to the second element (index 1)
        numbers[2] = 30; // Assign 30 to the third element (index 2)
        numbers[3] = 40; // Assign 40 to the fourth element (index 3)
        numbers[4] = 50; // Assign 50 to the fifth element (index 4)

        // Access and print the elements of the 'numbers' array.
        System.out.println("Elements of the 'numbers' array:");
        System.out.println("Element at index 0: " + numbers[0]); // Output: 10
        System.out.println("Element at index 1: " + numbers[1]); // Output: 20
        System.out.println("Element at index 2: " + numbers[2]); // Output: 30
        System.out.println("Element at index 3: " + numbers[3]); // Output: 40
        System.out.println("Element at index 4: " + numbers[4]); // Output: 50

        System.out.println();

        // Another way to declare and initialize an array with values directly.
        int[] ages = {25, 30, 22, 28, 35};

        // Get the length (number of elements) of the 'ages' array.
        int arrayLength = ages.length;
        System.out.println("Length of the 'ages' array: " + arrayLength); // Output: 5

        System.out.println();

        // Iterate through the 'ages' array using a for loop and print each element.
        System.out.println("Elements of the 'ages' array using a for loop:");
        for (int i = 0; i < ages.length; i++) {
            System.out.println("Element at index " + i + ": " + ages[i]);
        }

        System.out.println();

        // Iterate through the 'ages' array using an enhanced for loop (for-each loop).
        System.out.println("Elements of the 'ages' array using an enhanced for loop:");
        for (int age : ages) {
            System.out.println("Age: " + age);
        }

        System.out.println();

        // Example of an array of Strings.
        String[] names = {"Alice", "Bob", "Charlie"};

        System.out.println("Elements of the 'names' array:");
        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}
