package org.example.day1y5test;

public class BlackPrinter extends Printer {
    public BlackPrinter(int times) {
        super(times);
    }

    public BlackPrinter() {
    }

    @Override
    public void printTimes() {
        System.out.println("黑色打印" + super.getTimes() + "次");
    }


}
