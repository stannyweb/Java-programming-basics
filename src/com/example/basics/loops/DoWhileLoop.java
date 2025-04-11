package com.example.basics.loops;

public class DoWhileLoop {

    public static void main(String[] args) {

        // Example 1: Simple do-while loop to print numbers from 0 to 4
        System.out.println("Example 1: Printing numbers from 0 to 4");
        int i = 0;
        do {
            System.out.println("The value of i is: " + i);
            i++; // Increment the loop counter
        } while (i < 5);
        System.out.println();

        // Example 2: do-while loop that executes at least once
        System.out.println("Example 2: Loop that executes at least once");
        int counter = 5;
        do {
            System.out.println("Counter is: " + counter);
            counter++;
        } while (counter < 3); // Condition is false initially, but the loop runs once
        System.out.println();

        // Example 3: do-while loop to get user input (simulated)
        System.out.println("Example 3: Simulated user input loop");
        int userInput;
        int attempts = 0;
        do {
            attempts++;
            userInput = (int) (Math.random() * 10); // Simulate getting a random input
            System.out.println("Attempt " + attempts + ", Input: " + userInput);
        } while (userInput != 7); // Continue until the input is 7
        System.out.println("Correct input (7) received after " + attempts + " attempts.");
        System.out.println();

        // Example 4: do-while loop with a boolean flag
        System.out.println("Example 4: do-while loop with a boolean flag");
        boolean continueLoop = true;
        int loopCounter = 0;
        do {
            System.out.println("Loop counter: " + loopCounter);
            loopCounter++;
            if (loopCounter > 2) {
                continueLoop = false;
            }
        } while (continueLoop);
    }


}
