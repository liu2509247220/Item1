package org.example.day1y5jiekou3shouji;

public class Test {
    public static void main(String[] args) {
        CommonHandset commonHandset = new CommonHandset("华为", "Mate");
        commonHandset.info();
        commonHandset.call();
        commonHandset.sendInfo();
        commonHandset.play("music");

        commonHandset = new CommonHandset("pingg","15");
        commonHandset.info();
        commonHandset.call();
        commonHandset.sendInfo();
        commonHandset.play("答辩");
    }
}
