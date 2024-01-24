package org.example.day1y24.test8;

/**
 * @author 86150
 * @date 2024/1/24 11:30
 */
public class Test8 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.setName("奇数");
        t1.start();


        t2.setName("偶数");
        t2.start();

    }
}
