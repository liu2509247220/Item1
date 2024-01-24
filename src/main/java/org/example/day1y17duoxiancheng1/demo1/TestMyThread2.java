package org.example.day1y17duoxiancheng1.demo1;

/**
 * @author 86150
 * @date 2024/1/17 14:15
 */
public class TestMyThread2 {
    public static void main(String[] args) {

        MyThread2 t0 = new MyThread2();

        t0.setName("线程A");// 给t0name
        t0.start();


        for (int i = 1; i < 10; i++) {
            System.out.println("主线程" + Thread.currentThread().getName() + i);
            if (i == 3) {
                try {
                    t0.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
