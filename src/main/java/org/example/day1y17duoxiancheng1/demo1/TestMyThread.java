package org.example.day1y17duoxiancheng1.demo1;

/**
 * @author 86150
 * @date 2024/1/17 13:56
 */
public class TestMyThread {
    public static void main(String[] args) {
        //打印main进程↓
        System.out.println(Thread.currentThread().getName());
        //创建对象
        MyThread m0 = new MyThread();
        MyThread m1 = new MyThread();

        m0.setPriority(1);
        m1.setPriority(10);
        //查看优先级
        System.err.println(m0.getPriority());
        System.err.println(m1.getPriority());

//开启线程
        m0.start();
        m1.start();
    }
}
