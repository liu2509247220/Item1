package org.example.day1y18duoxiancheng2;

/**
 * @author 86150
 * @date 2024/1/18 14:25
 */
public class TestRunning {
    public static void main(String[] args) {
        Running r = new Running();
        Thread t1 = new Thread(r,"1");
        Thread t2 = new Thread(r,"2");
        Thread t3 = new Thread(r,"3");
        t1.start();
        t2.start();
        t3.start();

    }
}
