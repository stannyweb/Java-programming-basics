package com.example.basics.methods;

public class MethodOverloading {

    /**
     * A method to add two integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of the two integers.
     */
    public static int add(int a, int b) {
        System.out.println("Adding two integers.");
        return a + b;
    }

    /**
     * An overloaded method to add three integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @param c The third integer.
     * @return The sum of the three integers.
     */
    public static int add(int a, int b, int c) {
        System.out.println("Adding three integers.");
        return a + b + c;
    }

    /**
     * An overloaded method to add two doubles.
     *
     * @param a The first double.
     * @param b The second double.
     * @return The sum of the two doubles.
     */
    public static double add(double a, double b) {
        System.out.println("Adding two doubles.");
        return a + b;
    }

    /**
     * An overloaded method to concatenate two strings.
     *
     * @param str1 The first string.
     * @param str2 The second string.
     * @return The concatenation of the two strings.
     */
    public static String concatenate(String str1, String str2) {
        System.out.println("Concatenating two strings.");
        return str1 + str2;
    }

    public static void main(String[] args) {
        int sumInt2 = add(5, 3);
        System.out.println("Sum of two integers: " + sumInt2);

        int sumInt3 = add(5, 3, 2);
        System.out.println("Sum of three integers: " + sumInt3);

        double sumDouble = add(2.5, 3.7);
        System.out.println("Sum of two doubles: " + sumDouble);

        String combinedString = concatenate("Hello", " World");
        System.out.println("Concatenated string: " + combinedString);
    }
}