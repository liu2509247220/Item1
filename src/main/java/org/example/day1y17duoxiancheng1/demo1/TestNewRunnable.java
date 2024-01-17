package org.example.day1y17duoxiancheng1.demo1;

/**
 * @author 86150
 * @date 2024/1/17 14:20
 */
public class TestNewRunnable {
    public static void main(String[] args) {
        NewRunnable n1 = new NewRunnable();

        Thread t0 = new Thread(n1);
        t0.start();
    }
}
