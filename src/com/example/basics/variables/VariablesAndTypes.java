package com.example.basics.variables;

public class VariablesAndTypes {
    public static void main(String[] args) {

        // Declaring variables of different data types
        int age = 33; // Integer
        double salary = 2000.00; // Floating-point number
        boolean isEmployed = true; // Boolean value (true or false)
        String name = "Stan"; // String (text)

        // Printing the values of the variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Is Employed: " + isEmployed);

        // Modifying the value of a variable
        age = 35;
        System.out.println("New Age: " + age);
    }
}
