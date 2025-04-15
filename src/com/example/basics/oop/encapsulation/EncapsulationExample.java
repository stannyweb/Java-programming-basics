package com.example.basics.oop.encapsulation;

import java.time.LocalDate;

public class EncapsulationExample {

    public static void main(String[] args) {

        Printer printer = new Printer(50, true);

        System.out.println("Initial page count = " + printer.getPagesPrinted());

        int pagesToPrint = printer.printPages(5);
        System.out.printf("Current job pages: %d, Printer total: %d %n", pagesToPrint, printer.getPagesPrinted());

        pagesToPrint = printer.printPages(9);
        System.out.printf("Current job pages: %d, Printer total: %d %n", pagesToPrint, printer.getPagesPrinted());

    }
}
