package org.example.day1y8.test3;

public class Notice implements Input {
    String str;

    public Notice(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String display() {
        return "通知";
    }
}
