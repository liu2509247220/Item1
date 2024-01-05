package org.example.day1y5jiekoudiannao;

import org.example.day1y5jiekoudiannao.impl.Intel;

public class Printer {
    private EMS ems;
    private CPU cpu;
    private HardDisk hardDisk;

    public Printer(EMS ems, CPU cpu, HardDisk hardDisk) {
        this.ems = ems;
        this.cpu = cpu;
        this.hardDisk = hardDisk;
    }

    public Printer() {
    }

    public EMS getEms() {
        return ems;
    }

    public void setEms(EMS ems) {
        this.ems = ems;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "ems=" + ems +
                ", cpu=" + cpu +
                ", hardDisk=" + hardDisk +
                '}';
    }

    public void print() {
        System.out.println("计算机的信息如下");
        System.out.println("cpu的品牌是" + getCpu() + ",主频是3.8Ghz" + "\t" + "硬盘容量是" + getHardDisk() + "内存容量是" + getEms());
    }
}
