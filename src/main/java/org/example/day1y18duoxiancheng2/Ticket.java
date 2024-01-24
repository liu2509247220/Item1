package org.example.day1y18duoxiancheng2;

/**
 * @author 86150
 * @date 2024/1/18 11:22
 */
public class Ticket implements Runnable {
    private int num = 10;

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (num <= 0) {
                break;
            }

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            //锁
            synchronized (this) {
                if (num > 0) {
                    num--;
                    System.out.println(Thread.currentThread().getName() + "抢到第" + (10 - num) + "张票，剩余" + num + "张票。");
                }
            }
            if ("黄牛".equals(Thread.currentThread().getName())) {
                break;
            }
        }
    }
}
