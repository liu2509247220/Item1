package org.example.day1y17duoxiancheng1.demo1;

/**
 * @author 86150
 * @date 2024/1/17 13:55
 */
public class MyThread extends Thread {
    //继承Thread，重写run方法
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {

            try {
                //设置睡眠时间，每500毫秒线程一次
                Thread.sleep(500);
                //中断异常
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() + "," + i);  //获取当前线程名称
        }
    }
}
