package org.example.day1y18duoxiancheng2;

/**
 * @author 86150
 * @date 2024/1/18 14:22
 */
public class Running implements Runnable {
    @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName() + "号选手拿到了接力棒");
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "号选手跑了" + (i * 10) + "米！");

        }
    }
}
