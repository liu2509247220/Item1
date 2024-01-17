package org.example.day1y17duoxiancheng1.demo1;

/**
 * @author 86150
 * @date 2024/1/17 14:13
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {

        for (int i = 1; i < 6; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + "你好" + Thread.currentThread().getName());
        }
    }
}
