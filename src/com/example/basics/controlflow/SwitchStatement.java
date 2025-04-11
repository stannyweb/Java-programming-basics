package com.example.basics.controlflow;

import java.io.PrintStream;
import java.lang.reflect.AnnotatedArrayType;

public class SwitchStatement {

    public static void main(String[] args) {

        int dayOfWeek = 3; // Example: Let's say dayOfWeek is 3 (Wednesday)

        switch (dayOfWeek) {
            case 1 -> System.out.println("Monday");
            // Important: break statement exits the switch block
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day"); // Executed if none of the cases match
        }

        char grade = 'B'; // Example: Let's say the grade is 'B'

        switch (grade) {
            case 'A' -> System.out.println("Excellent!");
            case 'B' -> System.out.println("Good");
            case 'C' -> System.out.println("Average");
            case 'D' -> System.out.println("Poor");
            case 'F' -> System.out.println("Fail");
            default -> System.out.println("Invalid grade");
        }

        String nameOfFruit = getString();
        System.out.println(nameOfFruit);


        char charValue = 'B';
        String letterValue = switch (charValue) {
            case 'A' -> String.format("%c letter is for name Able", charValue);
            case 'B' -> String.format("%c letter is for name Baker", charValue);
            default -> throw new IllegalStateException("Unexpected value: " + charValue);
        };

        System.out.println(letterValue);
    }

    private static String getString() {

        String fruit = "Apple"; // Example: Let's say the fruit is "Apple"

        String nameOfFruit = switch (fruit) {
            case "Apple", "Orange" -> {
                String color = "Red or Green";
                String taste = "Sweet and crisp";

                yield String.format("An %s is %s and has a %s taste.", fruit, color, taste);
            }
            case "Banana" -> {
                yield "A banana is usually yellow and soft";
            }
            default -> "Unknown fruit";
        };
        return nameOfFruit;
    }


}
