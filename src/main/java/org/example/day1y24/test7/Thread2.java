package org.example.day1y24.test7;

/**
 * @author 86150
 * @date 2024/1/24 11:14
 */
public class Thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
