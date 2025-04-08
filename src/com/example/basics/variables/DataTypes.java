package com.example.basics.variables;

public class DataTypes {

    public static void main(String[] args) {
        // Primitive data types in Java
        byte byteValue = 127; // 8-bit integer
        short shortValue = 32767; // 16-bit integer
        int intValue = 2147483647; // 32-bit integer
        long longValue = 9223372036854775807L; // 64-bit integer (L suffix)
        float floatValue = 3.14f; // 32-bit floating-point number (f suffix)
        double doubleValue = 3.14159265359; // 64-bit floating-point number
        char charValue = 'A'; // Single character
        boolean booleanValue = true; // Boolean value (true or false)

        // Printing the values and sizes (approximate)
        System.out.println("byte: " + byteValue + " (8 bits)");
        System.out.println("short: " + shortValue + " (16 bits)");
        System.out.println("int: " + intValue + " (32 bits)");
        System.out.println("long: " + longValue + " (64 bits)");
        System.out.println("float: " + floatValue + " (32 bits)");
        System.out.println("double: " + doubleValue + " (64 bits)");
        System.out.println("char: " + charValue + " (16 bits)");
        System.out.println("boolean: " + booleanValue + " (not precisely defined)");
    }
}
