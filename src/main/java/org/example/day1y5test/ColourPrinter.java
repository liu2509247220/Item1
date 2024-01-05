package org.example.day1y5test;

public class ColourPrinter extends Printer{
    public ColourPrinter(int times) {
        super(times);
    }

    @Override
    public void printTimes() {
        System.out.println("彩色打印"+super.getTimes()+"次");
    }
}
