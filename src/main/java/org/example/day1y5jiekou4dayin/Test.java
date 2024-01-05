package org.example.day1y5jiekou4dayin;

import org.example.day1y5jiekou4dayin.impl.A4Paper;
import org.example.day1y5jiekou4dayin.impl.B5Paper;
import org.example.day1y5jiekou4dayin.impl.BlackInkBox;
import org.example.day1y5jiekou4dayin.impl.ColorInkBox;

public class Test {
    public static void main(String[] args) {
        //创建打印机打印对象
        Printer printer = new Printer();
        printer.setPaper(new A4Paper());
        printer.setInkBox(new BlackInkBox());
        printer.print();

        printer = new Printer();
        B5Paper b5Paper = new B5Paper();
//        printer.setPaper(b5Paper);
        ColorInkBox colorInkBox = new ColorInkBox();
        printer.setInkBox(colorInkBox);
        printer.print();


    }
}
