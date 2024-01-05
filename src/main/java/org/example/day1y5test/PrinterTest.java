package org.example.day1y5test;

public class PrinterTest {
    public static void main(String[] args) {
        BookShop bookShop = new BookShop();
        Printer printer = bookShop.givePrint(1);
        printer.printTimes();
        printer=bookShop.givePrint(2);
        printer.printTimes();

    }

}
