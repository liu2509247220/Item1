package org.example.day1y17duoxiancheng1.demo1;

/**
 * @author 86150
 * @date 2024/1/17 14:19
 */
public class NewRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 1000000; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
