package com.example.basics.controlflow;

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

        String fruit = "apple"; // Example: Let's say the fruit is "apple"

        switch (fruit) {
            case "apple":
            case "banana":
                System.out.println("Common fruit"); // Multiple cases can share the same code block
                break;
            case "orange":
                System.out.println("Citrus fruit");
                break;
            default:
                System.out.println("Unknown fruit");
        }
    }
}
