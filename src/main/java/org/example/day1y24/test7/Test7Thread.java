package org.example.day1y24.test7;

/**
 * @author 86150
 * @date 2024/1/24 11:13
 */
public class Test7Thread {
    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        t1.setName("线程aaaaaa");
        t1.start();
        Thread2 t2 = new Thread2();
        t2.setName("线程b+++");
        t2.start();


    }
}
