package org.example.day1y5jiekoudiannao;

import org.example.day1y5jiekoudiannao.impl.Eight;
import org.example.day1y5jiekoudiannao.impl.Intel;
import org.example.day1y5jiekoudiannao.impl.SSD;

public class Test {
    public static void main(String[] args) {
        Printer printer = new Printer();
        CPU cpu = new Intel();
        EMS ems = new Eight();
        HardDisk hardDisk = new SSD();
        cpu.pinPai();
        ems.emsSize();
        hardDisk.diskSize();
        printer.print();
    }
}
