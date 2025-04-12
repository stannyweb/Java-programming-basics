package com.example.basics.loops;

public class WhileLoop {

    public static void main(String[] args) {

        // Example 1: Simple while loop to print numbers from 0 to 4
        System.out.println("Example 1: Printing numbers from 0 to 4");
        int i = 0;
        while (i < 5) {
            System.out.println("The value of i is: " + i);
            i++; // Don't forget to increment the loop counter!
        }
        System.out.println();

        // Example 2: While loop to simulate a countdown
        System.out.println("Example 2: Countdown from 5 to 1");
        int countdown = 5;
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--; // Decrement the counter
        }
        System.out.println("Blast off!");
        System.out.println();

        // Example 3: While loop with a boolean flag to control execution
        System.out.println("Example 3: While loop controlled by a boolean flag");
        boolean running = true;
        int counter = 0;

        while (running) {
            System.out.println("Counter is: " + counter);
            counter++;
            if (counter > 3) {
                running = false; // Set the flag to exit the loop
            }
        }
        System.out.println("Loop finished.");
        System.out.println();

        // Example 4: While loop that continues until a specific condition is met
        System.out.println("Example 4: While loop until a condition is met");
        int number = 1;
        while (number <= 10) {
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            }
            number++;
        }
    }
}
