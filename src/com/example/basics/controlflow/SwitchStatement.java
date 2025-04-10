package com.example.basics.controlflow;

import java.lang.reflect.AnnotatedArrayType;

public class SwitchStatement {

    public static void main(String[] args) {

        int dayOfWeek = 3; // Example: Let's say dayOfWeek is 3 (Wednesday)

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break; // Important: break statement exits the switch block
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day"); // Executed if none of the cases match
        }

        char grade = 'B'; // Example: Let's say the grade is 'B'

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }

        String nameOfFruit = getString();
        System.out.println(nameOfFruit);
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
