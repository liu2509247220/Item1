package org.example.day1y5test;

public class BookShop {
    public Printer givePrint(int type){
        Printer printer = null;
        if (type ==1){
            printer = new ColourPrinter(2);

        } else if (type ==2) {
            printer = new BlackPrinter(3);
        }
        return printer;
    }


}
