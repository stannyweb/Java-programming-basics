package com.example.basics.oop.encapsulation;

public class Printer {

    private int tonerLevel; //percentage of toner left in the toner cartridges
    private int pagesPrinted; // total pages printed
    private boolean duplex; //if the printer will print on BOTH sides of
    // sheet of paper True for both sides false 1 side


    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100 ? tonerLevel : -1);
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {

        int addedAmount = tonerLevel + tonerAmount;
        if (addedAmount > 100 || addedAmount <= 0) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {

        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
