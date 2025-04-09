package com.example.basics.operators;

public class ArithmeticOperators {

    public static void main(String[] args) {
        // Declare variables
        int num1 = 10;
        int num2 = 5;
        double num3 = 7.0;
        double num4 = 3.0;

        // Addition
        int sum = num1 + num2;
        System.out.println("Sum: " + sum); // Output: Sum: 15

        // Subtraction
        int difference = num1 - num2;
        System.out.println("Difference: " + difference); // Output: Difference: 5

        // Multiplication
        int product = num1 * num2;
        System.out.println("Product: " + product); // Output: Product: 50

        // Integer Division
        int division = num1 / num2;
        System.out.println("Division (integer): " + division); // Output: Division (integer): 2

        // Floating-point Division
        double doubleDivision1 = num3 / num4;
        System.out.println("Division (double): " + doubleDivision1); // Output: Division (double): 2.3333333333333335
        double doubleDivision2 = num1 / num4;
        System.out.println("Division (double): " + doubleDivision2); // Output: Division (double): 3.3333333333333335

        // Remainder (Modulo)
        int remainder = num1 % num2;
        System.out.println("Remainder: " + remainder); // Output: Remainder: 0

        double remainder2 = num3 % num4;
        System.out.println("Remainder: " + remainder2); // Output: Remainder: 1.0

        // Unary Operators

        // Increment
        num1++; // Post-increment
        System.out.println("num1 after increment: " + num1); // Output: num1 after increment: 11

        int preIncrement = ++num2; // Pre-increment
        System.out.println("num2 after pre-increment: " + num2);     // Output: num2 after pre-increment: 6
        System.out.println("preIncrement: " + preIncrement);           // Output: preIncrement: 6

        // Decrement
        num1--; // Post-decrement
        System.out.println("num1 after decrement: " + num1); // Output: num1 after decrement: 10

        int preDecrement = --num2; // Pre-decrement
        System.out.println("num2 after pre-decrement: " + num2);   // Output: num2 after pre-decrement: 5
        System.out.println("preDecrement: " + preDecrement);         // Output: preDecrement: 5

        // Addition assignment
        num1 += num2;  // Equivalent to num1 = num1 + num2
        System.out.println("num1 after += num2: " + num1); // Output: num1 after += num2: 15

        // Subtraction assignment
        num1 -= num2; // Equivalent to num1 = num1 - num2;
        System.out.println("num1 after -= num2: " + num1); // Output: num1 after -= num2: 10

        // Multiplication assignment
        num1 *= num2;
        System.out.println("num1 after *= num2 :" + num1); // Output: num1 after *= num2 :50

        // Division assignment
        num1 /= num2;
        System.out.println("num1 after /= num2: " + num1); // Output: num1 after /= num2: 10

        // Remainder assignment
        num1 %= num2;
        System.out.println("num1 after %= num2: " + num1); // Output: num1 after %= num2: 0
    }
}
