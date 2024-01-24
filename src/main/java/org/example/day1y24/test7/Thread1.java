package org.example.day1y24.test7;

/**
 * @author 86150
 * @date 2024/1/24 11:17
 */
public class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
            if (i == 3) {
                try {
                    Thread.sleep(20);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
