package org.example.day1y24.test8;

/**
 * @author 86150
 * @date 2024/1/24 11:29
 */
public class Thread1 extends Thread {
    @Override
    public void run() {
        int a = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                a = i;
            }
            System.out.println(Thread.currentThread().getName() + a);
        }
    }
}
