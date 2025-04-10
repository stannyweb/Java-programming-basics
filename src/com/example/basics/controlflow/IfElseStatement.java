package com.example.basics.controlflow;

public class IfElseStatement {

    public static void main(String[] args) {
        // Example 1: Simple if-else statement checking if a number is positive or negative.
        int number = 10;

        if (number > 0) {
            // This block of code will execute if the condition (number > 0) is true.
            System.out.println("The number is positive.");
        } else {
            // This block of code will execute if the condition (number > 0) is false.
            System.out.println("The number is not positive (it's either zero or negative).");
        }

        System.out.println("--------------------");

        // Example 2: if-else statement checking if a student has passed or failed.
        int grade = 65;
        int passingGrade = 60;

        if (grade >= passingGrade) {
            System.out.println("Congratulations! You have passed.");
        } else {
            System.out.println("Sorry, you have failed.");
        }

        System.out.println("--------------------");

        // Example 3: if-else statement checking if a user is logged in.
        boolean isLoggedIn = true;

        if (isLoggedIn) {
            System.out.println("Welcome back!");
        } else {
            System.out.println("Please log in.");
        }

        System.out.println("--------------------");

        // Example 4: if-else statement with multiple conditions using logical OR operator.
        int age = 17;
        boolean hasParentalConsent = true;

        if (age >= 18 || hasParentalConsent) {
            System.out.println("You are allowed to enter.");
        } else {
            System.out.println("You are not allowed to enter.");
        }

        System.out.println("--------------------");

        // Example 5: Nested if-else statement to check the sign of a number more precisely.
        int anotherNumber = -5;

        if (anotherNumber > 0) {
            System.out.println("The number is positive.");
        } else if (anotherNumber < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
