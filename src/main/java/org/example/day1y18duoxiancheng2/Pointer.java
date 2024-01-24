package org.example.day1y18duoxiancheng2;

/**
 * @author 86150
 * @date 2024/1/18 11:11
 */
public class Pointer extends Thread {
    public Pointer(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + ":" + i + "号病人在看病！");
        }
    }
}
