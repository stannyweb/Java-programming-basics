package com.example.basics.methods;

public class SimpleMethod {

    /**
     * A simple method that prints a greeting message to the console.
     */
    public static void greet() {
        System.out.println("Hello from a simple method!");
    }

    /**
     * A method that takes a name as input and prints a personalized greeting.
     *
     * @param name The name of the person to greet.
     */
    public static void greetByName(String name) {
        System.out.println("Hello, " + name + "!");
    }

    /**
     * A method that adds two integers and returns the result.
     *
     * @param num1 The first integer.
     * @param num2 The second integer.
     * @return The sum of the two integers.
     */
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * A method that checks if a given number is even.
     *
     * @param number The integer to check.
     * @return true if the number is even, false otherwise.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        // Calling the greet method
        greet();

        // Calling the greetByName method with a specific name
        greetByName("Stan");

        // Calling the addNumbers method and printing the result
        int sum = addNumbers(5, 3);
        System.out.println("The sum is: " + sum);

        // Calling the isEven method and printing the result
        boolean evenCheck = isEven(10);
        System.out.println("Is 10 even? " + evenCheck);

        boolean oddCheck = isEven(7);
        System.out.println("Is 7 even? " + oddCheck);
    }
}