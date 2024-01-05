package org.example.day1y5jiekou4dayin;

import org.example.day1y5jiekou4dayin.impl.A4Paper;

public class Printer {
    //定义两个成员变量
    private A4Paper paper;
    private InkBox inkBox;

    public Printer() {
    }

    public Printer(A4Paper paper, InkBox inkBox) {
        this.paper = paper;
        this.inkBox = inkBox;
    }

    public A4Paper getPaper() {
        return paper;
    }

    public void setPaper(A4Paper paper) {
        this.paper = paper;
    }

    public InkBox getInkBox() {
        return inkBox;
    }

    public void setInkBox(InkBox inkBox) {
        this.inkBox = inkBox;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "paper=" + paper +
                ", inkBox=" + inkBox +
                '}';
    }

    public void print() {
        String color = inkBox.getColor();
        String size = paper.getSize();
        System.out.println(size + "，" + color);

    }

}
