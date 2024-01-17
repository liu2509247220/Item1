package org.example.day1y17duoxiancheng1.demo1;

/**
 * @author 86150
 * @date 2024/1/17 14:10
 */
public class TestMyRunnable {
    public static void main(String[] args) {
        MyRunnable m1 = new MyRunnable();

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(new MyRunnable());

        t1.start();
        t2.start();
    }
}
