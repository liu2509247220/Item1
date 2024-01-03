package org.example.day1y3duotai;

public class Test {
    public static void main(String[] args) {
        Boy boy = new Boy();

        ChineseGirl chineseGirl = new ChineseGirl();

        boy.lieten(chineseGirl);

        EnglishGirl englishGirl = new EnglishGirl();

        boy.lieten(englishGirl);
    }
}
