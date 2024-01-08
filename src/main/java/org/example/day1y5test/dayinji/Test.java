package org.example.day1y5test.dayinji;

public class Test {
    public static void main(String[] args) {

        BookShop bookShop = new BookShop();
        bookShop.printDocument(new BlackPrinter());

        ColorPrinter colorPrinter = new ColorPrinter();
        bookShop.printDocument(colorPrinter);
    }
}
