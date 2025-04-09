package com.example.basics.operators;

public class RelationalOperators {

    public static void main(String[] args) {
        // Declare variables
        int num1 = 10;
        int num2 = 5;
        int num3 = 10;

        // Equal to (==)
        boolean isEqual = (num1 == num2); // false
        System.out.println("num1 == num2: " + isEqual);

        isEqual = (num1 == num3); // true
        System.out.println("num1 == num3: " + isEqual);

        // Not equal to (!=)
        boolean isNotEqual = (num1 != num2); // true
        System.out.println("num1 != num2: " + isNotEqual);

        isNotEqual = (num1 != num3); // false
        System.out.println("num1 != num3: " + isNotEqual);

        // Greater than (>)
        boolean isGreaterThan = (num1 > num2); // true
        System.out.println("num1 > num2: " + isGreaterThan);

        isGreaterThan = (num2 > num3); // false
        System.out.println("num2 > num3: " + isGreaterThan);

        // Less than (<)
        boolean isLessThan = (num1 < num2); // false
        System.out.println("num1 < num2: " + isLessThan);

        isLessThan = (num2 < num3); // true
        System.out.println("num2 < num3: " + isLessThan);

        // Greater than or equal to (>=)
        boolean isGreaterThanOrEqual = (num1 >= num2); // true
        System.out.println("num1 >= num2: " + isGreaterThanOrEqual);

        isGreaterThanOrEqual = (num1 >= num3); // true
        System.out.println("num1 >= num3: " + isGreaterThanOrEqual);

        isGreaterThanOrEqual = (num2 >= num3); //false
        System.out.println("num2 >= num3: " + isGreaterThanOrEqual);

        // Less than or equal to (<=)
        boolean isLessThanOrEqual = (num1 <= num2); // false
        System.out.println("num1 <= num2: " + isLessThanOrEqual);

        isLessThanOrEqual = (num1 <= num3); // true
        System.out.println("num1 <= num3: " + isLessThanOrEqual);

        isLessThanOrEqual = (num2 <= num3); // true
        System.out.println("num2 <= num3: " + isLessThanOrEqual);
    }
}
